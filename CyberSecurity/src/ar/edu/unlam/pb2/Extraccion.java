package ar.edu.unlam.pb2;

public class Extraccion extends TransaccionMonetaria implements Monitoreable{
	
	private Double cantidadExtraccion;
	

	public Extraccion(Integer codigoTransaccion, String banco, Cliente cliente, Dispositivo dispositivo, Double cantidad) {
		super(codigoTransaccion, banco, cliente, dispositivo);
		this.cantidadExtraccion=cantidad;
	}
	
	public void extraerDinero(Double dineroAExtraer) {
		if(super.getSaldo()<=this.cantidadExtraccion) {
			super.setSaldo(super.getSaldo()-this.cantidadExtraccion);
		}
	}

	@Override
	public void monitorear() {
		// TODO Auto-generated method stub
		
	}
	

}
