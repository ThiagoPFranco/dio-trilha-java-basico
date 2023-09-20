import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int Conta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        int Agencia = scan.nextInt();

        System.out.println("Por favor digite seu nome!");
        String Nome = scan.next();

        System.out.println("Por favor digite seu sobrenome!");
        String sobreNome = scan.next();

        System.out.println("Por favor digite o seu saldo!");
        Double saldo = scan.nextDouble();


        System.out.println("Olá, " + Nome + " " + sobreNome + " obrigado por criar uma conta em nosso banco, sua Agência é: " + Agencia + ", " +  " Conta: " + Conta + " e seu saldo: R$" +  saldo + " já está disponível para saque.");

    }
}
