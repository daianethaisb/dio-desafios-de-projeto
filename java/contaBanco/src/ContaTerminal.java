import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Por favor, digite o numero da agência: ");
        Scanner agenciaScanner = new Scanner(System.in);
        String agencia = agenciaScanner.next();

        System.out.println("Por favor, digite o numero da conta: ");
        Scanner contaScanner = new Scanner(System.in);
        int conta = Integer.parseInt(contaScanner.next());

        System.out.println("Por favor, insira o nome do cliente: ");
        Scanner nomeScanner = new Scanner(System.in);
        String nome = nomeScanner.next();

        System.out.println("Por favor, digite o saldo do cliente: ");
        Scanner saldoScanner = new Scanner(System.in);
        float saldo = Float.parseFloat(saldoScanner.next());
        
        System.out.printf("Olá " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + conta + " e seu saldo %.2f já está disponível para saque" , saldo);
    }
}
