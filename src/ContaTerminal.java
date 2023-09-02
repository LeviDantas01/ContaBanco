import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int numAgencia;
        String agencia = "0025", nomeCliente;
        double saldo = 456;
        
        System.out.println("Por favor, digite o número da Agência !");
        numAgencia = sc.nextInt();
        
        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = sc.next();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque");
        
        
    }
}
