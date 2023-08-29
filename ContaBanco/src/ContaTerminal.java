import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        int agencia = sc.nextInt();

        System.out.print("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.print("Por favor, digite o nome do cliente: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");


    }
}