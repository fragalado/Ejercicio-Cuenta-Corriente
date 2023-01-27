package clase.dto;

import java.util.ArrayList;
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
	
	public CuentaCorrienteProfesor(String dni, String nombreTitular) {
		super();
		this.dni=dni;
		this.nombreTitular=nombreTitular;
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
		Scanner entradaOpcion = new Scanner(System.in);
		
		// Pedimos los datos
		System.out.println("Introduzca el nombre completo del titular: ");
		opcionEntradaNombreTitular = entradaOpcion.next();
		
		System.out.println("Introduzca el DNI del titular: ");
		opcionEntradaDni = entradaOpcion.next();
		
		
		entradaOpcion.close();
		return null;
	}
	
	public void ingresarDinero() {
		
	}
	
	public ArrayList<CuentaCorrienteProfesor> mostrarInformacion(String dniUsuario) {
		return null;
	}
}
