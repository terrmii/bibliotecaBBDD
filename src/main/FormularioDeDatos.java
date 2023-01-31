package main;

import java.util.Scanner;

import clases.Libro;

public class FormularioDeDatos {
	public static Libro pedirDatosLibro(Scanner scan) {
		//SIN HACER
		Libro libro = new Libro();
		System.out.println("Introduzca titulo: ");
		String titulo = scan.nextLine();
		libro.setTitulo(titulo);
		System.out.println("Introduzca el autor del libro: ");
		String autor = scan.nextLine();
		libro.setAutor(autor);
		System.out.println("Introduzca el numero de paginas: ");
		int numPag = Integer.parseInt(scan.nextLine());
		libro.setNumPag(numPag);
		return libro;
		
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {

		System.out.println("Introduce el nuevo titulo: ");
		libro.setTitulo(scan.nextLine());
		System.out.println("Introduce el autor: ");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce el numero de paginas");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		
		return libro;
		
	}
	
	public static int pedirIdLibro(Scanner scan) {
		
		System.out.println("Escribe la id del libro: ");
		int idLibro = Integer.parseInt(scan.nextLine());
		
		return idLibro;
	}
	
}
