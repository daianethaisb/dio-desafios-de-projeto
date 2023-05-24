
public class Main {

	public static void main(String[] args) {
		Cliente clienteTeste = new Cliente();
		clienteTeste.setNome("Cliente1");
		
		Conta cc = new ContaCorrente(clienteTeste);
		Conta poupanca = new ContaPoupanca(clienteTeste);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}