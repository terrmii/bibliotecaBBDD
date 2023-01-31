package main;

import java.sql.SQLException;
import java.util.Scanner;

import clases.Libro;
import clases.Menu;

public class GestorLibros {
	@SuppressWarnings("static-access")
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion;
		GestorBBDD bbdd = new GestorBBDD();

		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			Libro libro = new Libro();
			switch (opcion) {
			case Menu.INSERTAR_LIBRO: 
				libro = new FormularioDeDatos().pedirDatosLibro(scan);

				bbdd.insertarLibro(libro);
				break;
			
			case Menu.ELIMINAR_LIBRO: 
				int id = FormularioDeDatos.pedirIdLibro(scan);
				bbdd.eliminarLibro(id);
			case Menu.MODIFICAR_LIBRO:
				System.out.println("Eligue que id quieres modificar: ");
				id = FormularioDeDatos.pedirIdLibro(scan);
				bbdd.modificarLibro(id, FormularioDeDatos.pedirModificar(), FormularioDeDatos.nuevoValor());
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		} while (opcion != 0);
	}

}
