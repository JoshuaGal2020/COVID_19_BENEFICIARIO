package ayuda.joshua.entidades;

public class persona{
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getDui() {
		return Dui;
	}
	public void setDui(String dui) {
		Dui = dui;
	}
	protected int idPersona;
	protected String Nombre;
	protected String Apellido;
    protected String Usuario;
    protected String Pass;
    protected String Dui;

}
