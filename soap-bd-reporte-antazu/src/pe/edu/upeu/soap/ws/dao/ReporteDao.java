package pe.edu.upeu.soap.ws.dao;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Reporte;

@WebService
public interface ReporteDao {
	@WebMethod
	public ArrayList<Reporte> generarReporte(String fecha_ini, String fecha_fin, int idcliente);
}
