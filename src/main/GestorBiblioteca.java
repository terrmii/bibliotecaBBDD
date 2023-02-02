package main;

import java.sql.SQLException;
import java.util.Scanner;

import clases.Menu;

public class GestorBiblioteca {
	

	
		@SuppressWarnings("static-access")
		public void run() throws ClassNotFoundException, SQLException {
		
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
				
				System.out.println("Proximamente...");
				break;
				
			case Menu.SALIR:
				System.out.println("Saliendo... ");
				System.exit(0);
				break;
			default:
				System.out.println("Opcion incorrecta");
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

