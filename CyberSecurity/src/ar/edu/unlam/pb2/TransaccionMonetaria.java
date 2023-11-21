package ar.edu.unlam.pb2;

public class TransaccionMonetaria {
	
	private Integer codigoTransaccion;
	private String banco;
	private Double saldo;
	private Cliente cliente;
	private Dispositivo dispositivo;
	
	public TransaccionMonetaria(Integer codigoTransaccion, String banco, Cliente cliente, Dispositivo dispositivo) {
		super();
		this.codigoTransaccion = codigoTransaccion;
		this.banco = banco;
		this.cliente=cliente;
		this.dispositivo=dispositivo;
	}

	public Integer getCodigoTransaccion() {
		return codigoTransaccion;
	}

	public void setCodigoTransaccion(Integer codigoTransaccion) {
		this.codigoTransaccion = codigoTransaccion;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

}
