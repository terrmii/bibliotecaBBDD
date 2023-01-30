package main;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	}
	
	public Libro getLibro(int id) {
		//Return datos de la id que hemos introducido
		return null;
		
	}
}
