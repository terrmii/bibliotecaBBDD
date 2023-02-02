package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Libro;

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
	
	public void eliminarLibro(int id) throws ClassNotFoundException, SQLException {
		Conector con = new Conector();
		con.conectar();
		PreparedStatement eliminar = con.getCon().prepareStatement("DELETE FROM libros WHERE `libros`.`id` = ?");
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
	
	public Libro getLibro(int id) {
		
		return null;
		
	}
}
