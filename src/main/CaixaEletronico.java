package main;

public class CaixaEletronico {

	public void saque() {
		synchronized(this) {
			System.out.println("Realizando saque...");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void transferencia() {
		synchronized(this) {
			System.out.println("Realizando transferência...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
