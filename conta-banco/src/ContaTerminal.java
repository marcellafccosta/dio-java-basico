import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agencia!");
        int numAgencia = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        String numConta = sc.nextLine();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o valor do saldo para saque!");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
