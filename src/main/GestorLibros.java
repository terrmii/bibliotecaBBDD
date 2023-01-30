package main;

import java.util.Scanner;

import clases.Menu;

public class GestorLibros {
	public static void run(Scanner scan) {
		int opcion;
		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO: 
				System.out.println("ins socio");
			
			case Menu.ELIMINAR_LIBRO: 
				System.out.println("ins socio");
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		} while (opcion != 0);
	}

}
