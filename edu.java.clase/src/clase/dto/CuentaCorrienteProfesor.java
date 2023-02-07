package clase.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Modelo de las cuentas corrientes a gestionar
 * @author csi22
 */
public class CuentaCorrienteProfesor {
	
	// Atributos
	
	private String dni;
	private String nombreTitular;
	private double saldo;
	
	// Constructores
	
	public CuentaCorrienteProfesor(String dni, String nombreTitular, double saldo) {
		super();
		this.dni=dni;
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
	}
	
	public CuentaCorrienteProfesor() {
		super();
	}
	
	// Getter y Setters
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	// Sobreescritura toString
	
	@Override
	public String toString() {
		return "CuentaCorrienteProfesor [dni=" + dni + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
	}
	
	// Métodos

	public CuentaCorrienteProfesor crearCuenta() {
		// Variables necesarias
		String opcionEntradaDni;
		String opcionEntradaNombreTitular;
		
		// Creamos un Scanner
		Scanner entradaOpcion1 = new Scanner(System.in);
		
		// Pedimos los datos
		System.out.println("Introduzca el nombre completo del titular: ");
		opcionEntradaNombreTitular = entradaOpcion1.next();

		System.out.println("Introduzca el DNI del titular: ");
		opcionEntradaDni = entradaOpcion1.next();
						
		CuentaCorrienteProfesor cc = new CuentaCorrienteProfesor(opcionEntradaDni, opcionEntradaNombreTitular, 0);
		/* OPCION 2
		CuentaCorrienteProfesor cc = new CuentaCorrienteProfesor();
		cc.setDni(opcionEntradaDni);
		cc.setNombreTitular(opcionEntradaNombreTitular);
		cc.setSaldo(0); 
		*/
		
		
		entradaOpcion1.close();
		return cc;
	}
	
	public List<CuentaCorrienteProfesor> ingresarDinero(List<CuentaCorrienteProfesor> listaBD) {
		// pedir dni
		Scanner entradaOpcion1 = new Scanner(System.in);
		String opcionEntradaDni;
		
		System.out.println("Introduzca el DNI del titular: ");
		opcionEntradaDni = entradaOpcion1.next();

		// buscar la cuenta
		int contador = 0;
		boolean esEncontrado = false;
		for (CuentaCorrienteProfesor aux : listaBD) {
			if(aux.getDni().equals(opcionEntradaDni)) {
				esEncontrado = true;
				break;
			}
			contador++;
		}

		// SI - pedimos el ingreso
		// SI - suma la cantidad al saldo
		// SI - Devolver la lista con el saldo actualizado
		double opcionEntradaIngreso;

		if(esEncontrado) {
			System.out.println("Introduzca el ingreso: ");
			opcionEntradaIngreso = entradaOpcion1.nextDouble();
			double saldoActual = listaBD.get(contador).getSaldo();
			listaBD.get(contador).setSaldo(saldoActual + opcionEntradaIngreso);
		}
		// NO - mensaje no existe
		// NO - tres intentos y si no a crear cuenta
		else {
			
		}
		
		entradaOpcion1.close();
		return null;
	}
	
	public ArrayList<CuentaCorrienteProfesor> mostrarInformacion(String dniUsuario) {
		return null;
	}
}
