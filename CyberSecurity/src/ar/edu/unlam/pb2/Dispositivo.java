package ar.edu.unlam.pb2;

public class Dispositivo {
	
	private String so;
	private String direccionIP;
	private String localidad;
	
	
	public Dispositivo(String so, String direccionIP, String localidad) {
		this.so = so;
		this.direccionIP = direccionIP;
		this.localidad = localidad;
	}


	public String getSo() {
		return so;
	}


	public void setSo(String so) {
		this.so = so;
	}


	public String getDireccionIP() {
		return direccionIP;
	}


	public void setDireccionIP(String direccionIP) {
		this.direccionIP = direccionIP;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	

}
