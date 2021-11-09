package clase;

public class Usuario {
	
	/* nombre del usuario: un nombre o cadena de caracteres elegida por el usuario que se puede repetir en el sistema
	 * nombre de identificacion del usuario: cadena de caracteres elegida por el usuario que no se puede repetir en el sistema
	 * contraseña del usuario: una cadena de caracteres elegida por el usuario que no se puede repetir en el sistema
	 * */
	
	private String nombreUsuario;
	private String nombreIden;
	private String codigoUsuario;
	
	// getters y setters
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getNombreIden() {
		return nombreIden;
	}
	public void setNombreIden(String nombreIden) {
		this.nombreIden = nombreIden;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

}
