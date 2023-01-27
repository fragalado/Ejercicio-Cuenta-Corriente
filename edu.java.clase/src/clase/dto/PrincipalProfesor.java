package clase.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalProfesor {

	public static void main(String[] args) {
		// Inicializar el tipo CuentaCorriente
		CuentaCorrienteProfesor cccp = new CuentaCorrienteProfesor();
		
		// Listado de cuentas (Base de datos)
		List<CuentaCorrienteProfesor> listaCCCP = new ArrayList<>();
		
		// Imprimir el menú por consola
		// Scanner con la opción del usuario
		Scanner entradaOpcion = new Scanner(System.in);
		Boolean cerrarMenu = false;
		int opcion;
		while (!cerrarMenu) {
			// Mostramos el menu
			mostrarMenu();
			System.out.println("Introduzca la opción deseada: ");
			opcion = entradaOpcion.nextInt();
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
			
			switch (opcion) {
			case 1:
				listaCCCP.add(cccp.crearCuenta());
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				cerrarMenu = true;
				break;
			}
		}
		
	
		
		
		
		
		
		entradaOpcion.close();
	}
	
	private static void mostrarMenu() {
		System.out.println("1. Crear cuenta");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Mostrar información");
		System.out.println("5. Salir");
	}

}
