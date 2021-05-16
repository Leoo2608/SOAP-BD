package pe.edu.upeu.soap.ws.publico;

import javax.xml.ws.Endpoint;

import pe.edu.upeu.soap.ws.daoImpl.ReporteDaoImpl;

public class ReportePublic {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:5051/soap/cliente/reporte", new ReporteDaoImpl());
		System.out.println("Ejecutando......!");
		//http://localhost:5051/soap/cliente/reporte?wsdl
	}
}
