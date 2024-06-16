import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("|-----------------------------|");
        System.out.println("|Olá, cliente! Seja bem-vindo!|");
        System.out.println("|-----------------------------|");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora, digite o número da Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
