package clase;

public class Articulo {
	
	//Los articulos deben tener: Código de Articulo, Nombre/descripción y precio.
	
	private String codigoArt;
	private String nombre;
	private String descripcion;
	private double precio;
	
	// getters y setters
	
	public String getCodigoArt() {
		return codigoArt;
	}
	public void setCodigoArt(String codigoArt) {
		this.codigoArt = codigoArt;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
// constructor
}
