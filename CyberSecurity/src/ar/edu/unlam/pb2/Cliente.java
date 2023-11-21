package ar.edu.unlam.pb2;

public class Cliente {
	
	private String nombre;
	private Integer cuit;
	private String contrasenia;
	
	public Cliente(String apellidoNombreCliente, Integer cuitCliente, String contrasenia) {
		this.nombre=apellidoNombreCliente;
		this.cuit=cuitCliente;
		this.contrasenia=contrasenia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}
	

}
