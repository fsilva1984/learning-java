import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);

     double saldo = 237.48;

     System.out.println("Digite o nome do titular da conta");
     String nomeUsuario = sc.next();

     System.out.println("Por favor, digite o número da Agência");
     int numeroAgencia = sc.nextInt();

     System.out.println("Por favor, digite o número da conta com o digito");
     String numeroContaComDigito = sc.next();

     String msg = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque.", nomeUsuario, numeroAgencia, numeroContaComDigito, saldo);

     System.out.println(msg);
     sc.close();
    }
}
