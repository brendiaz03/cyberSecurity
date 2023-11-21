package ar.edu.unlam.pb2;

public class PagoDeServicio extends TransaccionMonetaria {
	
	private Double cantidad;

	public PagoDeServicio(Integer codigoTransaccion, String banco, Cliente cliente, Dispositivo dispositivo, Double cantidad) {
		super(codigoTransaccion, banco, cliente, dispositivo);
		this.cantidad=cantidad;
	}

}
