package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import clases.Libro;
import clases.Prestamo;
import clases.Socio;

/**
 * 
 * @author ${Arnold Bermell}
 *
 */

public class GestorBBDD {
	
	Conector conector = new Conector();
	

	public void insertarLibro(Libro libro) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement insertar = con.getCon().prepareStatement("INSERT INTO libros (titulo, autor, num_pag) VALUES (?, ?, ?) ");
		insertar.setString(1,  libro.getTitulo());
		insertar.setString(2, libro.getAutor());
		insertar.setInt(3, libro.getNumPag());
		insertar.execute();
	}
	
	public void insertarSocio(Socio socio) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement insertar = con.getCon().prepareStatement("INSERT INTO socios (nombre, apellido, direccion, poblacion, provincia, dni) VALUES (?, ?, ?, ?, ?, ?) ");
		insertar.setString(1,  socio.getNombre());
		insertar.setString(2, socio.getApellido());
		insertar.setString(3, socio.getDireccion());
		insertar.setString(4, socio.getPoblacion());
		insertar.setString(5, socio.getProvincia());
		insertar.setString(6, socio.getDni());
		insertar.execute();
	}
	public void realizarPrestamo(int idLibro, int idSocio, Date date, int devuelto) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement insertar = con.getCon().prepareStatement("INSERT INTO prestamos (id_libro, id_socio, fecha, devuelto) VALUES (?, ?, ?, ?) ");
		insertar.setInt(1, idLibro);
		insertar.setInt(2, idSocio);
		insertar.setDate(3,  (java.sql.Date) date);
		insertar.setInt(4, devuelto);
		insertar.execute();
	}
	public void eliminarLibro(int id) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement eliminar = con.getCon().prepareStatement("DELETE FROM libros WHERE `libros`.`id` = ?");
		eliminar.setInt(1, id);
		eliminar.execute();
	}
	
	public void eliminarSocio(int id) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement eliminar = con.getCon().prepareStatement("DELETE FROM socios WHERE `socios`.`id` = ?");
		eliminar.setInt(1, id);
		eliminar.execute();
	}
	
	public void modificarLibro(int id, String modificar, String nuevoValor) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement ps = con.getCon().prepareStatement("UPDATE libros SET "+ modificar +" = ? WHERE id = ?");
		ps.setString(1, nuevoValor);
		ps.setInt(2, id);
		ps.execute();
		}
	
	public void modificarSocio(int id, String modificar, String nuevoValor) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement ps = con.getCon().prepareStatement("UPDATE socios SET "+ modificar +" = ? WHERE id = ?");
		ps.setString(1, nuevoValor);
		ps.setInt(2, id);
		ps.execute();
		}
	

	public ArrayList<Libro> visualizarLibro() throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		
		PreparedStatement ps = con.getCon().prepareStatement("SELECT * FROM libros");
		ps.execute();
		ResultSet resultado = ps.executeQuery();
		ArrayList<Libro> libros = new ArrayList<Libro>();
		while (resultado.next()) {
			Libro libro = new Libro();
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNumPag(resultado.getInt("num_pag"));
			
			libros.add(libro);
		}
		
		return libros;
		
	}
	
	public ArrayList<Socio> visualizarSocio() throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		
		PreparedStatement ps = con.getCon().prepareStatement("SELECT * FROM socios");
		ps.execute();
		ResultSet resultado = ps.executeQuery();
		ArrayList<Socio> socios = new ArrayList<Socio>();
		while (resultado.next()) {
			Socio socio = new Socio();
			socio.setId(resultado.getInt("id"));
			socio.setNombre(resultado.getString("nombre"));
			socio.setApellido(resultado.getString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getString("poblacion"));
			socio.setProvincia(resultado.getString("provincia"));
			socio.setDni(resultado.getString("dni"));
			
			socios.add(socio);
		}
		
		return socios;
		
		
	}
	
	public Libro getLibro(int id) {
		
		return null;
		
	}
}
