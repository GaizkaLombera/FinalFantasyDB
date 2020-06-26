package ffdb.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ffdb.dao.FinalFantasyDAO;
import ffdb.model.FinalFantasyPOJO;

/**
 * Servlet implementation class ProductoController
 */
@WebServlet(description = "Administra peticiones para la tabla 'list'", urlPatterns = { "/ffdbcontrol" })
public class FfControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FfControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String opcion = request.getParameter("opcion");

		/*--------------------*/
		//// INSERTAR////
		if (opcion.equals("insertar")) {
			System.out.println("Presionada la opcion: Añadir nueva entrada");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/insertar.jsp");
			requestDispatcher.forward(request, response);
		} else if (opcion.equals("listar")) {

			FinalFantasyDAO ffDAO = new FinalFantasyDAO();
			List<FinalFantasyPOJO> lista = new ArrayList<>();
			try {
				lista = ffDAO.obtenerLista();
				for (FinalFantasyPOJO ff : lista) {
					System.out.println(ff);
				}

				request.setAttribute("lista", lista);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/listar.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Presionada la opcion: Lista de juegos");

			/*--------------------*/
			//// EDITAR////
		} else if (opcion.equals("editar")) {
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("Editar juego con id: " + id);
			FinalFantasyDAO ffDAO = new FinalFantasyDAO();
			FinalFantasyPOJO ff = new FinalFantasyPOJO();
			try {
				ff = ffDAO.obtenerEntrada(id);
				System.out.println(ff);
				request.setAttribute("juegos", ff);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/editar.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			/*--------------------*/
			//// ELIMINAR////
		} else if (opcion.equals("eliminar")) {
			FinalFantasyDAO ffDAO = new FinalFantasyDAO();
			int id = Integer.parseInt(request.getParameter("id"));
			try {
				ffDAO.eliminar(id);
				System.out.println("Juego con id " + id + " eliminado.");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/*--------------------*/
	//// GUARDAR////
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = request.getParameter("opcion");

		if (opcion.equals("guardar")) {
			FinalFantasyDAO ffDAO = new FinalFantasyDAO();
			FinalFantasyPOJO ff = new FinalFantasyPOJO();

			ff.setNombre(request.getParameter("nombre"));
			ff.setFecha(request.getParameter("fecha"));
			ff.setDirector(request.getParameter("director"));
			ff.setArtista(request.getParameter("artista"));

			try {
				ffDAO.guardar(ff);
				System.out.println("Entrega guardada en BD");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (opcion.equals("editar")) {
			FinalFantasyPOJO ff = new FinalFantasyPOJO();
			FinalFantasyDAO ffDAO = new FinalFantasyDAO();
			
			System.out.println("Has presionado la opción EDITAR");
			
			ff.setId(Integer.parseInt(request.getParameter("id")));
			ff.setNombre(request.getParameter("nombre"));
			ff.setFecha(request.getParameter("fecha"));
			ff.setDirector(request.getParameter("director"));
			ff.setArtista(request.getParameter("artista"));
			try {
				ffDAO.editar(ff);
				System.out.println("Entrada de la BD editada");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// doGet(request, response);
	}

}
