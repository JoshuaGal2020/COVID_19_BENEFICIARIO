package ayuda.joshua.entidades;

public class beneficiario extends persona {
	public int getIdbeneficiario() {
		return idbeneficiario;
	}
	public void setIdbeneficiario(int idbeneficiario) {
		this.idbeneficiario = idbeneficiario;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	protected int idbeneficiario;
	protected int idPersona;
	protected int cantidad;

}
