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
		System.out.println("0. Salir");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println("1. Insertar libro");
		System.out.println("2. Eliminar libro");
		System.out.println("3. Modificar libro");
		System.out.println("4. Visualizar libros");
		System.out.println("0. Atras");
	}
	
	public static void mostrarMenuSocios() {
		System.out.println("1. Insertar socio");
		System.out.println("2. Eliminar socio");
		System.out.println("3. Modificar socio");
		System.out.println("4. Visualizar socio");
		System.out.println("0. Atras");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println("1. Realizar prestamo");
	}
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MODIFICAR_LIBRO = 3;
	public static final int VISUALIZAR_LIBROS = 4;
	
	public static final int INSERTAR_SOCIO = 1;
	public static final int ELIMINAR_SOCIO = 2;
	public static final int MODIFICAR_SOCIO = 3;
	public static final int VER_SOCIOS = 4;
	
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	public static final int SALIR = 0;
	
	public static final int REALIZAR_PRESTAMO = 1;
}
