package ar.edu.unlam.pb2;

public class Transferencia extends TransaccionMonetaria implements Monitoreable{
	
	private Double cantidad;

	public Transferencia(Integer codigoTransaccion, String banco, Cliente cliente, Dispositivo dispositivo, Double cantidad) {
		super(codigoTransaccion, banco, cliente, dispositivo);
		this.cantidad=cantidad;
	}
	
	public void transferir() {
		if(super.getSaldo()<=this.cantidad) {
			super.setSaldo(super.getSaldo()-this.cantidad);
		}
	}

	@Override
	public void monitorear() {
		// TODO Auto-generated method stub
		
	}
}
