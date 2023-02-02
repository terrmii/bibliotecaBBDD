package main;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

import clases.Libro;
import clases.Socio;

public class FormularioDeDatos {
	public static Libro pedirDatosLibro(Scanner scan) {

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
	
	public static Socio pedirDatosSocio(Scanner scan) {

		Socio socio = new Socio();
		System.out.println("Introduzca su nombre: ");
		String nombre = scan.nextLine();
		socio.setNombre(nombre);
		System.out.println("Introduzca su apellido: ");
		String apellido = scan.nextLine();
		socio.setApellido(apellido);
		System.out.println("Introduzca su direccion: ");
		String direccion = scan.nextLine();
		socio.setDireccion(direccion);
		System.out.println("Introduzca la poblacion: ");
		String poblacion = scan.nextLine();
		socio.setPoblacion(poblacion);
		System.out.println("Introduca la provincia: ");
		String provincia = scan.nextLine();
		socio.setProvincia(provincia);
		System.out.println("Introduzca el dni: ");
		String dni = scan.nextLine();
		socio.setDni(dni);
		
		return socio;
		
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
	
	public static Socio modificarDatosSocio(Socio socio, Scanner scan) {

		System.out.println("Introduzca su nombre: ");
		String nombre = scan.nextLine();
		socio.setNombre(nombre);
		System.out.println("Introduzca su apellido: ");
		String apellido = scan.nextLine();
		socio.setApellido(apellido);
		System.out.println("Introduzca su direccion: ");
		String direccion = scan.nextLine();
		socio.setDireccion(direccion);
		System.out.println("Introduzca la poblacion: ");
		String poblacion = scan.nextLine();
		socio.setPoblacion(poblacion);
		System.out.println("Introduca la provincia: ");
		String provincia = scan.nextLine();
		socio.setProvincia(provincia);
		System.out.println("Introduzca el dni: ");
		String dni = scan.nextLine();
		socio.setDni(dni);
		
		return socio;
		
	}
	
	public static int pedirIdLibro(Scanner scan) {
		
		System.out.println("Escribe la id del libro: ");
		int idLibro = Integer.parseInt(scan.nextLine());
		
		return idLibro;
	}
	
	public static int pedirIdSocio(Scanner scan) {
		
		System.out.println("Escribe la id del socio: ");
		int idSocio = Integer.parseInt(scan.nextLine());
		
		return idSocio;
	}
	
	public static Date pedirFecha(Scanner scan) throws ParseException {
	    Date now = new Date();

	    java.sql.Date sqlDate = new java.sql.Date(now.getTime());
		return sqlDate;
	}
	
	public static String pedirModificar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Que desea modificar: (titulo, autor, num_pag)?");
		String modificar = scan.nextLine();
		scan.close();
		return modificar;
	}
	public static String pedirModificarSocio() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Que desea modificar: (nombre, apellido, direccion, poblacion, provincia, dni)?");
		String modificar = scan.nextLine();
		scan.close();
		return modificar;
	}
	public static Boolean devuelto(Scanner scan) {
		
		String texto;
		texto = scan.nextLine();
		if(texto == "S") {
			return true;
		}
		else {
		return false;
				}
	}
	
	public static String nuevoValor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nuevo valor");
		String nuevoValor = scan.nextLine();
		scan.close();
		return nuevoValor;
	}
	
}
