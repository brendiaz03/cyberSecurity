package ar.edu.unlam.pb2;

public class Celular extends Dispositivo {
	
	private String imei;
	private Boolean isBiometria;

	public Celular(String so, String direccionIP, String localidad, String imei, Boolean isBiometria) {
		super(so, direccionIP, localidad);
		this.imei=imei;
		this.isBiometria=isBiometria;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Boolean getIsBiometria() {
		return isBiometria;
	}

	public void setIsBiometria(Boolean isBiometria) {
		this.isBiometria = isBiometria;
	}
	

}
