package main;

import java.sql.SQLException;
import java.util.Scanner;

import clases.Menu;
import clases.Socio;

public class GestorSocios {
	@SuppressWarnings("static-access")
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion;
		GestorBBDD bbdd = new GestorBBDD();
		
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			Socio socio = new Socio();
			switch (opcion) {
			case Menu.INSERTAR_SOCIO: 
				socio = new FormularioDeDatos().pedirDatosSocio(scan);
				bbdd.insertarSocio(socio);
	
				break;
			case Menu.ELIMINAR_SOCIO:
				int id = FormularioDeDatos.pedirIdSocio(scan);
				bbdd.eliminarSocio(id);
				break;
			case Menu.MODIFICAR_SOCIO:
				id = FormularioDeDatos.pedirIdSocio(scan);
				bbdd.modificarSocio(id, FormularioDeDatos.pedirModificarSocio(), FormularioDeDatos.nuevoValor());
				break;
				
			case Menu.VER_SOCIOS:
				Visor.mostrarSocios(bbdd.visualizarSocio());
				break;
			default:
				Visor.mostrarMensaje(opcion + " no es un valor valido");
			}
		} while (opcion != 0);

	}
}
