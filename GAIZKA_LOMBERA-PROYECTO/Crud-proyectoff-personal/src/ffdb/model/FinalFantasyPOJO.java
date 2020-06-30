package ffdb.model;

public class FinalFantasyPOJO {
	private int id;
	private String nombre;
	private String fecha;
	private String director;
	private String artista;
	
	//Métodos getters y setters
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
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
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
	
	//Constructores
	public FinalFantasyPOJO(int id, String nombre, String fecha, String director, String artista) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.director = director;
		this.artista = artista;
	}
	public FinalFantasyPOJO() {}
	
	//Método toString() para comprobaciones
	@Override
	public String toString() {
		return "-Entrega Final Fantasy- "
				+ "\n id: " + id 
				+ "\n Título: " + nombre 
				+ "\n Año de lanzamiento:" + fecha 
				+ "\n Director del juego: " + director
				+ "\n Artista principal: " + artista;
	}
	
	
	
	

}
