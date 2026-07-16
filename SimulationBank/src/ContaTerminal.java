import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NumeroConta = 0;
        String Agencia = "0800";
        String NomeCliente = "";
        double Saldo = 0.0;

        System.out.println("Por favor, digite o número da conta: ");
        NumeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        Agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente: ");
        NomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo da conta: ");
        Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");


    }
    
}
