package main;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import clases.Menu;

public class GestorBiblioteca {
	

	
		@SuppressWarnings("static-access")
		public void run() throws ClassNotFoundException, SQLException, ParseException {
		
			Scanner scan = new Scanner(System.in);
			int opcion;
		
		do {
			Menu.mostrarMenuPrincipal();

			opcion = Integer.parseInt(scan.nextLine());
		try {
			switch (opcion) {
			
			case Menu.GESTIONAR_LIBROS:
				
				new GestorLibros().run(scan);
				break;
			case Menu.GESTIONAR_SOCIOS:
				
				new GestorSocios().run(scan);
				break;
			
			case Menu.GESTIONAR_PRESTAMOS:
				
				new GestorPrestamos().run(scan);
				break;
				
			case Menu.SALIR:
				System.out.println("Saliendo... ");
				System.exit(0);
				break;
			default:
				Visor.mostrarMensaje(opcion + " no es un valor valido");
				break;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} while (opcion != Menu.SALIR);
		
		
	}
}

