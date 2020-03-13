package main;

public class App {

	public static void main(String[] args) {
		
		CaixaEletronico caixa = new CaixaEletronico();
		
		Thread cliente1 = new Thread(new TarefaSaque(caixa));
		Thread cliente2 = new Thread(new TarefaTransferencia(caixa));
		Thread cliente3 = new Thread(new TarefaSaque(caixa));
		
		cliente1.start();
		cliente2.start();
		cliente3.start();

	}

}
