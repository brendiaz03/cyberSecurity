package ar.edu.unlam.pb2;

public class PagoQR extends TransaccionMonetaria implements Monitoreable {
	
	private Double cantidad;

	public PagoQR(Integer codigoTransaccion, String banco, Cliente cliente, Dispositivo dispositivo, Double cantidad) {
		super(codigoTransaccion, banco, cliente, dispositivo);
		this.cantidad=cantidad;
	}
	
	public void pagarConQR() {
		if(super.getSaldo()<=this.cantidad) {
			super.setSaldo(super.getSaldo()-this.cantidad);
		}
	}

	@Override
	public void monitorear() {
		// TODO Auto-generated method stub
		
	}

}
