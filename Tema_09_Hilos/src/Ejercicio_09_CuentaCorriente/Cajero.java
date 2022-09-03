package Ejercicio_09_CuentaCorriente;

import java.text.DecimalFormat;

public class Cajero {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	double saldo;
	
	/*
	 * Clase comun entre el consumidor y el productor
	 */

	public Cajero() {
		
		this.saldo = 0.0;
		
	}
	
	
	
	public synchronized  void retirarPasta (double dineroSacado, String nombre){
		
			while(dineroSacado > this.saldo) {
				try {
					System.out.println(nombre +" ha intentado sacar dinero  pero no hay un duro");
					System.out.println("hay que avisar a papa");
					wait();
				}catch(Exception e) {
					System.out.println("Error a la hora de retirar dinero");
				}
			}
				this.saldo -=dineroSacado;
				System.out.println(nombre+ " ha sacado " +df.format(dineroSacado)+ "€");
				System.out.println("Queda en la Cuenta " +df.format(this.saldo)+ "€");
				
	}
			
			
		
	
	
	
	public synchronized void ingrasarPasta(double dineroIngresado, String nombre) {
		
		
		
			if(dineroIngresado >0 ||dineroIngresado <3000) {
				
				this.saldo +=dineroIngresado;
				System.out.println(nombre + " ha ingresado "  +df.format(dineroIngresado) + "€");
				System.out.println("En la cuenta hay "  +df.format(this.saldo) + "€");
				notifyAll();
			}else {
				
				try {
					System.out.println(nombre+ " Se ha olvidado la cartera en casa");
					notifyAll();
				} catch (Exception e) {
					System.out.println("Error a la hora de ingresar dinero");
									e.printStackTrace();
				}
			}
		
		}
		
		
		
	
}


