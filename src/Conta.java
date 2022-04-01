
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected String nome;
	protected int cpf;
	
	
    public String getNome() {

		return nome;
	}
    
	public int getCpf() {
		return cpf;
	}


	public static int SEQUENCIAL = 1;
    
    @Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public Conta(String nome) {
		this.agencia = AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		System.out.println("Nome: " + nome);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("Nome: " + nome);
		
	}


}
