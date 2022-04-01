
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String nome) {
		super(nome);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("====== Extrato Conta Poupanca ========");
		super.getNome();
		super.getCpf();
		super.imprimirInfosComuns();
	}

}
