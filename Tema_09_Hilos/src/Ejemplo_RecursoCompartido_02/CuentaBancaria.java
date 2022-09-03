package Ejemplo_RecursoCompartido_02;

public class CuentaBancaria  {
	
	private int saldo;
	private int retiro;
	
	public CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}
	
	public  void retirarSaldo(int retiro) {
		this.saldo -= retiro;
	}

	public int getSaldo() {
		return saldo;
	}	
}
