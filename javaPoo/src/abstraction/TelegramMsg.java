package abstraction;

import java.util.concurrent.ThreadLocalRandom;

public class TelegramMsg extends AbstractMsgService {

  @Override
  public void saivehistory(String msg) {
    System.out.println(msg + ": saved in history");
  }

  @Override
  public void sendNewMsg(String text) {
    setMsg(text);
    System.out.println(checkInternet());
  }

  private String msg;

  private String checkInternet() {

    String variableLocal = "";

    if (ThreadLocalRandom.current().nextBoolean()) {
      saivehistory(getMsg());
      variableLocal = getMsg() + ": successful sending";

    } else {
      variableLocal = "internet not connected";
    }
    return variableLocal;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
