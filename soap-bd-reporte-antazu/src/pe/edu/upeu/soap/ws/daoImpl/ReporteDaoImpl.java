package pe.edu.upeu.soap.ws.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.jws.WebService;

import pe.edu.upeu.soap.ws.dao.ReporteDao;
import pe.edu.upeu.soap.ws.entity.Reporte;
import pe.edu.upeu.soap.ws.util.Conexion;

@WebService(endpointInterface = "pe.edu.upeu.soap.ws.dao.ReporteDao")
public class ReporteDaoImpl implements ReporteDao {
	
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	
	@Override
	public ArrayList<Reporte> generarReporte(String fecha_ini, String fecha_fin, int idcliente) {
		ArrayList<Reporte> lista = new ArrayList<>();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement("select c.nombres, c.apellidos, v.fecha,v.tipodoc,v.numdoc, p.nomprod, d.cantidad, d.precio  from cliente c JOIN venta v on v.idcliente = c.idcliente JOIN detalle d on d.idventa = v.idventa JOIN producto p on p.idproducto = d.idproducto WHERE c.idcliente = ? and v.fecha BETWEEN ? and ?");
			ps.setInt(1, idcliente);
			ps.setString(2, fecha_ini);
			ps.setString(3, fecha_fin);
			rs = ps.executeQuery();
			while(rs.next()) {
				Reporte rp = new Reporte();
				rp.setNombres(rs.getString("nombres"));
				rp.setApellidos(rs.getString("apellidos"));
				rp.setFecha(rs.getString("fecha"));
				rp.setTipodoc(rs.getString("tipodoc"));
				rp.setNumdoc(rs.getString("numdoc"));
				rp.setNomprod(rs.getString("nomprod"));
				rp.setCantidad(rs.getInt("cantidad"));
				rp.setPrecio(rs.getDouble("precio"));
				lista.add(rp);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return lista;
	}

}
