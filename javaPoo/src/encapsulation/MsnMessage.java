package encapsulation;

public class MsnMessage {
  /*
   * The sendMessage method will be the only one available to other classes
   */
  public static void main(String[] args) {
    MessageService msn = new MessageService();

    msn.sendMessage("Hello, World!");

  }
}
