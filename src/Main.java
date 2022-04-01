
public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente("Mateus");
		Conta cp = new ContaPoupanca("David");
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	
		cc.depositar(100);
		
		cc.imprimirExtrato();
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
	}

}
