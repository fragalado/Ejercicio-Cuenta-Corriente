package clase.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaCorriente {
	
	// Atributos
	private String dni;
	private String nombreTitular;
	private double saldo;
	
	// Constructores
	public CuentaCorriente(String dni, String nombreTitular) {
		super();
		this.dni = dni;
		this.nombreTitular = nombreTitular;
	}
	
	// Métodos
	public List<CuentaCorriente> crearCuenta(List<CuentaCorriente> lista) {
		Scanner sc = new Scanner(System.in);
		List<CuentaCorriente> listaCuentaBancaria = new ArrayList<>();
		saldo= 0.0;
		
		sc.close();
		
		return listaCuentaBancaria;
	}

	public void ingresarDinero(int cantIngresar) {
		saldo += cantIngresar;
	}
	
	public void mostrarInformacion() {
		System.out.println("DNI: "+ dni + "; Nombre Titular: "+ nombreTitular + "; Saldo: " + saldo);
	}

	public void sacarDinero(int cantSacar) {
		// Mostraremos si es posible sacar el dinero pedido y después mostraremos el saldo restante
		if(cantSacar <= saldo) {
			System.out.println("Sacando dinero..");
			saldo = saldo - cantSacar;
			System.out.println("Saldo restante: " + saldo);
		}
		// Si no es posible sacar el dinero, solo mostraremos que no hay suficinte saldo
		else
			System.out.println("No ha sido posible sacar "+cantSacar+"$. No hay suficiente saldo");
	}
	
	@Override
	public String toString() {
		return "CuentaCorriente [dni=" + dni + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
	}

}
