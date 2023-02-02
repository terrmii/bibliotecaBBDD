package main;

import java.util.ArrayList;

import clases.Libro;
import clases.Socio;

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
	
	public static void mostrarSocios(ArrayList<Socio> socio) {
		System.out.println("Id | Nombre | Apellido | Direccion | Poblacion | Provincia | DNI");
		for (int i = 0; i < socio.size(); i++) {
			System.out.println(socio.get(i).getId() + " | " + socio.get(i).getNombre() + " | " + socio.get(i).getApellido()+ " | " + socio.get(i).getDireccion()
					+ " | " + socio.get(i).getPoblacion() + " | " + socio.get(i).getProvincia() + " | " + socio.get(i).getDni());
		}
	}
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}	
}
