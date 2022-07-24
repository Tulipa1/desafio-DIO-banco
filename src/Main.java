
public class Main {

	public static void main(String[] args) {
		Cliente jennifer = new Cliente();
		jennifer.setNome("Jennifer");
		
		Conta cc = new ContaCorrente(jennifer);
		Conta poupanca = new ContaPoupanca(jennifer);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
