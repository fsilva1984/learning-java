package encapsulation;

import java.util.concurrent.ThreadLocalRandom;

public class MessageService {

  // encapsulation concept

  /*
   * encapsulation concept, hides processes
   * that do not need to be seen.
   */
  private boolean checkConnection;

  private void setCheckConnection(boolean checkConnection) {
    this.checkConnection = checkConnection;
  }

  private String getCheckConnection() {
    String response = "";
    if (checkConnection) {
      response = "Conexão ON";
    } else {
      response = "Conexão OFF";
    }
    return response;
  }

  // network card response
  private boolean networkCard() {
    return ThreadLocalRandom.current().nextBoolean();
  }

  private void history(String msg) {
    System.out.println("\n"+msg+": Salvo no historico");
  }

  public void sendMessage(String msg) {
    setCheckConnection(networkCard());
    if (getCheckConnection().equals("Conexão ON")) {
      System.out.println(msg);
      System.out.println("Mensagem enviada com sucesso");
      history(msg);
    } else {
      System.out.println(" Messagem não pode ser enviada, check sua conexão");
    }
  }


}
