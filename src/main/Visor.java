package main;

import java.util.ArrayList;

import clases.Libro;

/**
 * 
 */

public class Visor {
	
	public static void mostrarLibros(ArrayList<Libro> libro ) {
		System.out.println("Id | Titulo | Autor | Numero paginas");
		for (int i = 0; i < libro.size(); i++) {
			System.out.println(libro.get(i).getId() + " | " + libro.get(i).getTitulo() + " | " + libro.get(i).getAutor()+ " | " + libro.get(i).getNumPag());
		}
	}
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}	
}
