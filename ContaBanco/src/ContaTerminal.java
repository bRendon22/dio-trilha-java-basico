//TODO: Importe a classe antes de utilizar 
import java.util.Locale; 
import java.util.Scanner;

public class ContaTerminal {
 //Será utilizado a classe Scanner ele nos permite receber dados durante a execução do programa.
    public static void main(String[] args) {

        //criando o objeto scanner TODO: Exibir as mensagens digitadas  
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Por gentileza, digite seu nome completo ! ");
        String nome = scanner.next();

        System.out.println("Por gentileza, digite o número de sua Conta!");
        int conta = scanner.nextInt(); 

        System.out.println("Qual a sua Agencia ? ");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo, por gentileza !");
        double saldo = scanner.nextDouble(); 

        System.out.println("Olá" + " " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é" + " " + agencia + ", conta " + " " + conta + " e seu saldo" + " "+ saldo + " já está disponível para saque");

    }
}
