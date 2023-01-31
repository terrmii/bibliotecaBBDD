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
				
			default:
				System.out.println("Opcion incorrecta");
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
//final int OPCION_UNO = 1;
//final int OPCION_DOS = 2;
//final int OPCION_TRES = 3;
//final int SALIR = 0;
//Scanner scan = new Scanner(System.in);
//int opcion_menu;
//do {
//	System.out.println(" ------MENU------");
//	System.out.println(OPCION_UNO + ". primera opcion");
//	System.out.println(OPCION_DOS + ". segunda opcion");
//	System.out.println(OPCION_TRES + ". tercera opcion");
//	System.out.println(SALIR + ". Salir");
//	System.out.println("Elije una de las opciones");
//	opcion_menu = Integer.parseInt(scan.nextLine());
//	switch (opcion_menu) {
//	case OPCION_UNO:
//		System.out.println("primera opcion seleccionada\n");
//		break;
//	case OPCION_DOS:
//		System.out.println("segunda opcion seleccionada\n");
//		break;
//	case OPCION_TRES:
//		System.out.println("tercera opcion seleccionada\n");
//		break;
//	case SALIR:
//		System.out.println("ADIOS");
//		break;
//	default:
//		System.out.println("Opcion incorrecta!");
//	}
//} while (opcion_menu != SALIR);
