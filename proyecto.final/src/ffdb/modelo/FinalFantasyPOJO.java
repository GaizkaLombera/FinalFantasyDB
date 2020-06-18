package ffdb.modelo;

public class FinalFantasyPOJO {

	//Atributo privados del POJO para mapear
	private int id;
	private String nombre;
	private int fecha;
	private String director;
	private String artista;
	
	//Métodos Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	//Constructor con todos los atributos y constructor por defecto
	public FinalFantasyPOJO(int id, String nombre, int fecha, String director, String artista) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.director = director;
		this.artista = artista;
	}
	public FinalFantasyPOJO() {}
	
	
	//Método toString() para hacer comprobaciones.
	@Override
	public String toString() {
		return "FinalFantasyPOJO [id:" + id 
				+ "\n Nombre: " + nombre 
				+ "\n Año de lanzamiento: " + fecha 
				+ "\n Director: " + director
				+ "\n Arista principal: =" + artista + "]";
	}
	
	
	
	
}
