package pe.edu.upeu.soap.ws.util;

import java.util.ArrayList;

import pe.edu.upeu.soap.ws.daoImpl.ReporteDaoImpl;
import pe.edu.upeu.soap.ws.entity.Reporte;

public class Test {
	public static void main(String[] args) {
		if(Conexion.getConexion()!=null) {
			System.out.println("Conexión Lista!\n");
		}else {
			System.out.println("Error!");
		}
		/*ReporteDaoImpl r = new ReporteDaoImpl();
		ArrayList<Reporte> l = r.generarReporte("2021-05-01", "2021-05-09", 1);
		System.out.println("Reporte: \n");
        for(int i=0; i < l.size(); i++){
            System.out.println("Nombres y Apellidos: "+l.get(i).getNombres()+", "+l.get(i).getApellidos() );
            System.out.println("Fecha de compra: "+ l.get(i).getFecha());
            System.out.println("Tipo de Documento: " +l.get(i).getTipodoc());
            System.out.println("Nro. Documento: " +l.get(i).getNumdoc());
            System.out.println("Nombre de producto: "+ l.get(i).getNomprod());
            System.out.println("Cantidad: " +l.get(i).getCantidad());
            System.out.println("Precio total: " +l.get(i).getPrecio()+"\n");
        }*/
		
		
	}
}
