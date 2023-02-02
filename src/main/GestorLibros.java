package main;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import clases.Libro;
import clases.Menu;

public class GestorLibros {
	@SuppressWarnings("static-access")
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException, ParseException {
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
				break;
			case Menu.MODIFICAR_LIBRO:
				id = FormularioDeDatos.pedirIdLibro(scan);
				bbdd.modificarLibro(id, FormularioDeDatos.pedirModificar(), FormularioDeDatos.nuevoValor());
				break;
			case Menu.VISUALIZAR_LIBROS:
				Visor.mostrarLibros(bbdd.visualizarLibro());
				break;
			case Menu.SALIR:
				new GestorBiblioteca().run();
			default:
				Visor.mostrarMensaje(opcion + " no es un valor valido");
			}
			
		} while (opcion != 0);
	}

}
