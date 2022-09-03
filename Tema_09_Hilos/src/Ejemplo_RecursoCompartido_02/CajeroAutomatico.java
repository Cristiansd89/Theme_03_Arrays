package Ejemplo_RecursoCompartido_02;


public class CajeroAutomatico implements Runnable {

	
	CuentaBancaria Cuenta1 = new CuentaBancaria(300);
	
	
	@Override
	//Aqui van a intentar entrar los 2 hilos a le vez
	public void run() {
		
		//Este metodo lo van a llamar 5 veces cada hilo
		//Y desde este metodo vamos a llamar al resto de metodos
		for(int i = 0; i< 7; i++) {
			retirarCajero(30);
			try {
				Thread.sleep(400);
			}catch (Exception e) {
			}
		
		}
	
	}
	//Mientra el saldo sea Mayor o igual a la cantida de dinero sacara dinero
	//Con Synchronized hasta que no salga un hilo no entraria el otro
	public synchronized void retirarCajero(int dinero) {
		
		if(Cuenta1.getSaldo() >= dinero ) {
			System.out.println("Saldo Actual :" +Cuenta1.getSaldo());
			Cuenta1.retirarSaldo(dinero);
			///Para obtener el nombre Vamos autilizar el metodo currentThread().getName();
			System.out.println("El usuario : " +Thread.currentThread().getName());
			System.out.println(" Ha retirado "+dinero+ " tu nuevo saldo es de : "  +Cuenta1.getSaldo());
			System.out.println(" ");
			
		}else {
			System.out.println("Se queda la cuenta al descubierto");
		}
	}
	
	
	
	
}
