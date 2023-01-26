package clases;

import java.util.Scanner;

public class Menu {
	
	public static void menuPrincipal() {
		final int OPCION_UNO = 1;
		final int OPCION_DOS = 2;
		final int OPCION_TRES = 3;
		final int SALIR = 0;
		Scanner scan = new Scanner(System.in);
		int opcion_menu;
		do {
			System.out.println(" ------MENU------");
			System.out.println(OPCION_UNO + ". Gestionar Libros");
			System.out.println(OPCION_DOS + ". Gestionar Socios");
			System.out.println(OPCION_TRES + ". Gestionar Prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());
			switch (opcion_menu) {
			case OPCION_UNO:
				System.out.println("Gestionar libros\n");
				menuLibros();
				break;
			case OPCION_DOS:
				System.out.println("segunda opcion seleccionada\n");
				menuSocios();
				break;
			case OPCION_TRES:
				System.out.println("tercera opcion seleccionada\n");
				menuPrestamos();
				break;
			case SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
		} while (opcion_menu != SALIR);
	}
	
	public static void menuLibros() {
		
	}
	
	public static void menuSocios() {
		
	}
	
	public static void menuPrestamos() {
		
	}
}
