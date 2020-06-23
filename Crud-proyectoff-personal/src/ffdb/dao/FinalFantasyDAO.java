package ffdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ffdb.conexion.Conexion;
import ffdb.model.FinalFantasyPOJO;

public class FinalFantasyDAO {
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;

	/////GUARDAR/////
	// Metodo CRUD para guardar los datos introducidos
	public boolean guardar(FinalFantasyPOJO ff) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO list (name, date, director, artist) VALUES(?,?,?,?)";
			statement = connection.prepareStatement(sql);

			
			statement.setString(1, ff.getNombre());
			statement.setString(2, ff.getFecha());
			statement.setString(3, ff.getDirector());
			statement.setString(4, ff.getArtista());
			

			estadoOperacion = statement.executeUpdate() > 0;

			connection.commit();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		return estadoOperacion;
	}

	/////EDITAR/////
	// Metodo CRUD para editar los datos de la tabla "list"
	public boolean editar(FinalFantasyPOJO ff) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE list SET name=?, date=?, director=?, artist=? WHERE id=?";
			statement = connection.prepareStatement(sql);

			statement.setString(1, ff.getNombre());
			statement.setString(2, ff.getFecha());
			statement.setString(3, ff.getDirector());
			statement.setString(4, ff.getArtista());
			statement.setInt(5, ff.getId());

			estadoOperacion = statement.executeUpdate() > 0;
			connection.commit();
			statement.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		return estadoOperacion;
	}

	/////ELIMINAR/////
	// Metodo CRUD para eliminar una entrada de la tabla "list"
	public boolean eliminar(int idProducto) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		try {
			connection.setAutoCommit(false);
			sql = "DELETE FROM list WHERE id=?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, idProducto);

			estadoOperacion = statement.executeUpdate() > 0;
			connection.commit();
			statement.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		return estadoOperacion;
	}

	/////LISTA/////
	// Metodo CRUD para obtener lista de juegos
	public List<FinalFantasyPOJO> obtenerLista() throws SQLException {
		ResultSet resultSet = null;
		List<FinalFantasyPOJO> listaFf= new ArrayList<>();

		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM list";
			statement=connection.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				FinalFantasyPOJO ff=new FinalFantasyPOJO();
				
				ff.setId(resultSet.getInt(1));
				ff.setNombre(resultSet.getString(2));
				ff.setFecha(resultSet.getString(3));
				ff.setDirector(resultSet.getString(4));
				ff.setArtista(resultSet.getString(5));
				
				listaFf.add(ff);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaFf;
	}

	/////JUEGO/////
	// Metodo CRUD para obtener un juego
	public FinalFantasyPOJO obtenerEntrada(int id) throws SQLException {
		ResultSet resultSet = null;
		FinalFantasyPOJO ff=new FinalFantasyPOJO();

		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM list WHERE id =?";
			statement=connection.prepareStatement(sql);
			statement.setInt(1, id);
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {				
				ff.setId(resultSet.getInt(1));
				ff.setNombre(resultSet.getString(2));
				ff.setFecha(resultSet.getString(3));
				ff.setDirector(resultSet.getString(4));
				ff.setArtista(resultSet.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ff;
	}

	/*----------------------------------------------------------------------------*/
	// Conexion pool
	private Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}

}
