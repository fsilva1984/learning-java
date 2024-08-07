package abstraction;

import java.util.concurrent.ThreadLocalRandom;

public class FacebookMsg extends AbstractMsgService {

  // abstract concept

  @Override
  public void saivehistory(String msg) {
    System.out.println(msg + ": Salvo no historico");
  }

  @Override
  public void sendNewMsg(String text) {
    setMsg(text);
    System.out.println(checkInternet());
  }

  private String msg;

  private String checkInternet() {

    String msgLocal = "";

    if (ThreadLocalRandom.current().nextBoolean()) {
      saivehistory(getMsg());
      msgLocal =  getMsg() + ": Mensagem enviada com sucesso";

    } else {
      msgLocal = "Verifique sua conexão com a internet";
    }
    return msgLocal;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
