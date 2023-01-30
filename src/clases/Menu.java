package clases;

/**
 * 
 * @author ${Arnold Bermell}
 *
 */
public class Menu {
	
	public static void mostrarMenuPrincipal() {
		System.out.println("1. Gestionar libros");
		System.out.println("2. Gestionar socios");
		System.out.println("3. Gestionar prestamos");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println("1. Insertar libro");
		System.out.println("2. Eliminar libro");
		System.out.println("3. Ver libros");
	}
	
	public static void mostrarMenuSocios() {
		System.out.println("1. Ver socios");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println("1. Realizar prestamo");
	}
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
}
