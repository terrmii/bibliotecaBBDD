package main;

import java.sql.SQLException;
import java.util.Scanner;

import clases.Menu;
import clases.Prestamo;

public class GestorPrestamos {

		public void run(Scanner scan) throws ClassNotFoundException, SQLException {
			int opcion;
			GestorBBDD bbdd = new GestorBBDD();
			
			do {
				Menu.mostrarMenuPrestamos();
				opcion = Integer.parseInt(scan.nextLine());
				Prestamo prestamo = new Prestamo();
				
				switch (opcion) {
				case Menu.REALIZAR_PRESTAMO:
					
					break;
				case Menu.DEVOLVER_LIBRO:
					
					break;
				case Menu.SALIR:
					new GestorBiblioteca().run();
				break;
				default:
					Visor.mostrarMensaje(opcion + " no es un valor valido");
				}
			} while (opcion != 0);
		}
	
}
