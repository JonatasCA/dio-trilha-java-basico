
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String bancoAgencia;
        String nomeCliente;
        int contaNumero;
        float contaSaldo;

        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência! ");
        bancoAgencia = meuScanner.nextLine();
        System.out.println("Por favor, digite o seu nome! ");
        nomeCliente = meuScanner.nextLine();
        System.out.println("Por favor, digite o número da conta! ");
        contaNumero = meuScanner.nextInt();
        System.out.println("Por favor, digite o saldo! ");
        contaSaldo = meuScanner.nextFloat();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + bancoAgencia + ", conta número " + contaNumero + ", e o seu saldo de " + contaSaldo + " já está disponível para saque.");

        meuScanner.close();

    }
}
