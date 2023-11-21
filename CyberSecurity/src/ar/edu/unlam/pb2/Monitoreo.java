package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Monitoreo {
	
	private String nombreSistema;
	private List<Cliente> clientes;
	private List<Dispositivo> dispositivos;
	private List<TransaccionMonetaria> transaccionesMonetarias; 

	public Monitoreo(String nombreSistema) {
		this.nombreSistema=nombreSistema;
		this.clientes= new ArrayList<>();
		this.dispositivos= new ArrayList<>();
		this.transaccionesMonetarias= new ArrayList<>();
	}

	public String getNombreSistema() {
		return nombreSistema;
	}

	public void setNombreSistema(String nombreSistema) {
		this.nombreSistema = nombreSistema;
	}

	public void ingresarCliente(Cliente nuevo) {
		if(nuevo != null) {
			clientes.add(nuevo);
		}
	}

	public Cliente getCliente(Integer cuitCliente) {
		for(Cliente c : clientes) {
			if(c.getCuit().equals(cuitCliente)) {
				return c;
			}
		}
		return null;
	}

	public void ingresarDispositivo(Dispositivo dispositivo) {
		if(dispositivo != null) {
			dispositivos.add(dispositivo);
		}	
	}

	public Dispositivo getDispositivo(String ip) {
		for(Dispositivo d: dispositivos) {
			if(d.getDireccionIP().equals(ip)) {
				return d;
			}
		}
		return null;
	}

	public void ingresarTransaccionMonetaria(TransaccionMonetaria transaccion) {
		if(transaccion != null) {
			transaccionesMonetarias.add(transaccion);
		}
	}

	public TransaccionMonetaria getExtraccion(TransaccionMonetaria transaccion) {
		for(TransaccionMonetaria t: transaccionesMonetarias) {
			if(t.getCodigoTransaccion().equals(transaccion.getCodigoTransaccion())) {
				return t;
			}
		}
		return null;
	}
	
	
	

	
}
