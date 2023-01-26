package clases;

import java.sql.Date;
/**
 * 
 * @author ${Arnold Bermell}
 *
 */
public class Prestamo {

	private int idLibro;
	private int idSocio;
	private Date fecha;
	private boolean devuelto;
	
	public Prestamo() {
		
	}
	
	public Prestamo(int idLibro, int idSocio, Date fecha, boolean devuelto) {
		this.idLibro = idLibro;
		this.idSocio = idSocio;
		this.fecha = fecha;
		this.devuelto = devuelto;
	}
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean getDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	
	
	
}
