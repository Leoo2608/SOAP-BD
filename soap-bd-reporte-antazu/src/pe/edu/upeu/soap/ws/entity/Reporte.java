package pe.edu.upeu.soap.ws.entity;

public class Reporte {
	private String nombres;
	private String apellidos;
	private String fecha;
	private String tipodoc;
	private String numdoc;
	private String nomprod;
	private int cantidad;
	private double precio;
	
	public Reporte() {
		super();
	}
	public Reporte(String nombres, String apellidos, String fecha, String tipodoc, String numdoc, String nomprod,
			int cantidad, double precio) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
		this.nomprod = nomprod;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
