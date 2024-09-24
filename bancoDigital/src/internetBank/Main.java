package internetBank;
import internetBank.usuarios.CriadorDeUsuario;
import  internetBank.tipoDeConta.*;

public class Main {
    public static void main(String[] args) {
    	
    	CriadorDeUsuario ricardo = new CriadorDeUsuario("Ricardo", 123456, 12345678);
        System.out.println(ricardo.toString());
        
        ContaPoupanca ricardoPoupanca = new ContaPoupanca();
        
        ricardoPoupanca.setDepositoPoupanca(7.45);
        ricardoPoupanca.setTransferenciaPoupanca(5.00,"Marilene");
        ricardoPoupanca.setSaquePoupanca(1.25);
                
        System.out.println(ricardoPoupanca.extratoPoupanca());
        
        System.out.println(ricardoPoupanca.saldoPoupanca());
        
        System.out.println("\n\tCONTA CORRENTE\n");
        
      
    }
}
