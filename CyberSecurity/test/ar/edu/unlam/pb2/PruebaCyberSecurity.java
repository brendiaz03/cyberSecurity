package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebaCyberSecurity {
	
	@Test
	public void queSePuedaCrearUnCliente() {
		String apellidoNombreCliente="Diaz Katherine";
		Integer cuitCliente = 42156466;
		Cliente nuevo = new Cliente(apellidoNombreCliente, cuitCliente, "brenda123");
		
		Monitoreo monitoreo = new Monitoreo("Brenda Monitoreacion");
		monitoreo.ingresarCliente(nuevo);
		assertEquals(nuevo, monitoreo.getCliente(cuitCliente));
	}
	
	@Test
	public void queSePuedaCrearUnDispositivo() {
		String apellidoNombreCliente="Diaz Katherine";
		Integer cuitCliente = 42156466;
		Cliente nuevo = new Cliente(apellidoNombreCliente, cuitCliente, "brenda123");
		Dispositivo celular = new Celular("Windows", "1.2", "San Justo", "imei?", true);
		
		Monitoreo monitoreo = new Monitoreo("Brenda Monitoreacion");
		monitoreo.ingresarCliente(nuevo);
		monitoreo.ingresarDispositivo(celular);
		
		assertEquals(nuevo, monitoreo.getCliente(cuitCliente));
		assertEquals(celular, monitoreo.getDispositivo("1.2"));
	}
	
	@Test
	public void queSePuedaMonitorearUnaExtraccion() {
		String apellidoNombreCliente="Diaz Katherine";
		Integer cuitCliente = 42156466;
		Double cantidad= 0.0;
		Cliente nuevo = new Cliente(apellidoNombreCliente, cuitCliente, "brenda123");
		Dispositivo celular = new Celular("Windows", "1.2", "San Justo", "imei?", true);
		TransaccionMonetaria extraccion = new Extraccion(123, "Banco Galicia",nuevo, celular, cantidad);
		
		Monitoreo monitoreo = new Monitoreo("Brenda Monitoreacion");
		monitoreo.ingresarCliente(nuevo);
		monitoreo.ingresarDispositivo(celular);
		monitoreo.ingresarTransaccionMonetaria(extraccion);
		
		assertEquals(nuevo, monitoreo.getCliente(cuitCliente));
		assertEquals(celular, monitoreo.getDispositivo("1.2"));
		assertEquals(extraccion, monitoreo.getExtraccion(extraccion));
	}
	
	@Test
	public void queSePuedaMonitorearUnaTransferencia(){
		String apellidoNombreCliente="Diaz Katherine";
		Integer cuitCliente = 42156466;
		Double cantidad= 0.0;
		Cliente nuevo = new Cliente(apellidoNombreCliente, cuitCliente, "brenda123");
		Dispositivo celular = new Celular("Windows", "1.2", "San Justo", "imei?", true);
		TransaccionMonetaria transferencia = new Transferencia(123, "Banco Galicia",nuevo, celular, cantidad);
		
		Monitoreo monitoreo = new Monitoreo("Brenda Monitoreacion");
		monitoreo.ingresarCliente(nuevo);
		monitoreo.ingresarDispositivo(celular);
		monitoreo.ingresarTransaccionMonetaria(transferencia);
		
		assertEquals(nuevo, monitoreo.getCliente(cuitCliente));
		assertEquals(celular, monitoreo.getDispositivo("1.2"));
		assertEquals(transferencia, monitoreo.getExtraccion(transferencia));
	}
	
	@Test
	public void queSePuedaMonitorearUnPagoConQR() {
		String apellidoNombreCliente="Diaz Katherine";
		Integer cuitCliente = 42156466;
		Double cantidad= 0.0;
		Cliente nuevo = new Cliente(apellidoNombreCliente, cuitCliente, "brenda123");
		Dispositivo celular = new Celular("Windows", "1.2", "San Justo", "imei?", true);
		TransaccionMonetaria pagoQR = new PagoQR(123, "Banco Galicia",nuevo, celular, cantidad);
		
		Monitoreo monitoreo = new Monitoreo("Brenda Monitoreacion");
		monitoreo.ingresarCliente(nuevo);
		monitoreo.ingresarDispositivo(celular);
		monitoreo.ingresarTransaccionMonetaria(pagoQR);
		
		assertEquals(nuevo, monitoreo.getCliente(cuitCliente));
		assertEquals(celular, monitoreo.getDispositivo("1.2"));
		assertEquals(pagoQR, monitoreo.getExtraccion(pagoQR));
	}
	
	@Test
	public void queSePuedaMonitorearUnPagoDeServicio() {
		String apellidoNombreCliente="Diaz Katherine";
		Integer cuitCliente = 42156466;
		Double cantidad= 0.0;
		Cliente nuevo = new Cliente(apellidoNombreCliente, cuitCliente, "brenda123");
		Dispositivo celular = new Celular("Windows", "1.2", "San Justo", "imei?", true);
		TransaccionMonetaria pagoDeServicio = new PagoDeServicio(123, "Banco Galicia",nuevo, celular, cantidad);
		
		Monitoreo monitoreo = new Monitoreo("Brenda Monitoreacion");
		monitoreo.ingresarCliente(nuevo);
		monitoreo.ingresarDispositivo(celular);
		monitoreo.ingresarTransaccionMonetaria(pagoDeServicio);
		
		assertEquals(nuevo, monitoreo.getCliente(cuitCliente));
		assertEquals(celular, monitoreo.getDispositivo("1.2"));
		assertEquals(pagoDeServicio, monitoreo.getExtraccion(pagoDeServicio));
	}
	
	
	@Test
	public void queSePuedaMonitorearUnAltaDeUsuario() {
		String apellidoNombreCliente="Diaz Katherine";
		Integer cuitCliente = 42156466;
		Cliente nuevo = new Cliente(apellidoNombreCliente, cuitCliente, "brenda123");
		Dispositivo celular = new Celular("Windows", "1.2", "San Justo", "imei?", true);
		TransaccionNoMonetaria altaDeUsuario = new AltaDeUsuario(123, "Banco Galicia",nuevo, celular);
		
		Monitoreo monitoreo = new Monitoreo("Brenda Monitoreacion");
		monitoreo.ingresarCliente(nuevo);
		monitoreo.ingresarDispositivo(celular);
		monitoreo.ingresarTransaccionNoMonetaria(altaDeUsuario);
		
		assertEquals(nuevo, monitoreo.getCliente(cuitCliente));
		assertEquals(celular, monitoreo.getDispositivo("1.2"));
		assertEquals(altaDeUsuario, monitoreo.getExtraccion(altaDeUsuario));
	}
}
