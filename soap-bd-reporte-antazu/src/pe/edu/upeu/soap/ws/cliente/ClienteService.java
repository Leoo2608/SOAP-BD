package pe.edu.upeu.soap.ws.cliente;

import java.util.List;

import pe.edu.upeu.soap.ws.dao.Reporte;
import pe.edu.upeu.soap.ws.daoImpl.ReporteDao;
import pe.edu.upeu.soap.ws.daoImpl.ReporteDaoImplService;

public class ClienteService {
	public static void main(String[] args) {
		ReporteDaoImplService rs = new ReporteDaoImplService();
		ReporteDao rd = rs.getReporteDaoImplPort();
		List<Reporte> l = rd.generarReporte("2021-05-01", "2021-05-09", 2);
		System.out.println("Reporte: \n");
		if(l.isEmpty()) {
			System.out.println("No hay ventas registradas...");
		}else {
			 for(int i=0; i < l.size(); i++){
		            System.out.println("Nombres y Apellidos: "+l.get(i).getNombres()+", "+l.get(i).getApellidos() );
		            System.out.println("Fecha de compra: "+ l.get(i).getFecha());
		            System.out.println("Tipo de Documento: " +l.get(i).getTipodoc());
		            System.out.println("Nro. Documento: " +l.get(i).getNumdoc());
		            System.out.println("Nombre de producto: "+ l.get(i).getNomprod());
		            System.out.println("Cantidad: " +l.get(i).getCantidad());
		            System.out.println("Precio total: " +l.get(i).getPrecio()+"\n");
		        }
		}
       
	}
}
