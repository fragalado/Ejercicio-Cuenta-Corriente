package clase.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Prueba CuentaCorriente
		Scanner sc = new Scanner(System.in);
		// Lista CuentaCorriente
		List<CuentaCorriente> listaCuentas = new ArrayList<>();
		
		// Creamos varios objetos de tipo CuentaCorriente para guardarlos en la lista
		CuentaCorriente ejem1 = new CuentaCorriente("53965131D", "Fran Gallego");
		CuentaCorriente ejem2 = new CuentaCorriente("53965131A", "DANI Gallego");
		CuentaCorriente ejem3 = new CuentaCorriente("53965131B", "PACO Gallego");
		CuentaCorriente ejem4 = new CuentaCorriente("53965131B", "ISIDRO Gallego");
		CuentaCorriente ejem5 = new CuentaCorriente("53965131C", "MIGUE Gallego");
		CuentaCorriente ejem6 = new CuentaCorriente("53965131E", "FRANCISCO Gallego");
		
		listaCuentas.add(ejem1);
		listaCuentas.add(ejem2);
		listaCuentas.add(ejem3);
		listaCuentas.add(ejem4);
		listaCuentas.add(ejem5);
		listaCuentas.add(ejem6);
		
		// Ahora para poder usar los metodos vamos a tener que recorrer la lista para poder usarlos
		int captura;
		for (CuentaCorriente var : listaCuentas) {
			// Vamos a hacer un bucle que mostrará las opciones que hay, se saldrá con el "0"
			do {
				System.out.println("\t1.Mostrar información");
				System.out.println("\t2.Ingresar dinero");
				System.out.println("\t3.Sacar dinero");
				System.out.println("\t0.Salir");
				System.out.print("Introduzca una opción: ");
				captura = sc.nextInt();
				// Vamos a controlar los errores
				while(captura < 0 || captura > 3) {
					// Mostramos un error
					System.err.println("Error: Opción no correcta");
					System.out.print("Introduzca una opción: ");
					captura = sc.nextInt();
				}
				
				// Ahora que tenemos la opción correcta mostraremos la opción elegida
				switch (captura) {
				case 1:
					var.mostrarInformacion();
					break;
				case 2:
					System.out.println("Cantidad a ingresar: ");
					var.ingresarDinero(sc.nextInt());	// Aqui no estamos controlando los errores de entrada
					break;
				case 3:
					System.out.println("Cantidad a sacar: ");
					var.sacarDinero(sc.nextInt());		// Aqui tampoco controlamos los errores
					break;
				}
			} while (captura != 0);
		}
		sc.close();
		
	}

}
