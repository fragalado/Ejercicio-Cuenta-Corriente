package clase.dto;

import java.util.ArrayList;

/**
 * Modelo de las cuentas corrientes a gestionar
 * @author csi22
 */
public class CuentaCorrienteProfesor {
	
	// Atributos
	
	private String dni;
	private String nombreTitular;
	private double saldo;
	
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
	
	// Métodos
	
	public void crearCuenta() {
		
	}
	
	public void ingresarDinero() {
		
	}
	
	public ArrayList<CuentaCorrienteProfesor> mostrarInformacion(String dniUsuario) {
		return null;
	}
}
