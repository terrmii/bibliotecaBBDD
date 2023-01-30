package main;

import java.util.Scanner;

import clases.Menu;

public class GestorSocios {
	public static void run(Scanner scan) {
		int opcion;
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			
			switch (opcion) {
			case Menu.VER_SOCIOS: 
				System.out.println("Socios: ");
				
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (opcion != 0);

	}
}
