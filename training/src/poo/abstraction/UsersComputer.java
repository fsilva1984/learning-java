package abstraction;

public class UsersComputer {

  public static void main(String[] args) {
    FacebookMsg fbMessage = new FacebookMsg();
    String msgFromFaceBook = "Ola, Mundo!";

    fbMessage.sendNewMsg(msgFromFaceBook);

    System.out.println("\n-------------------------------------------\n");

    TelegramMsg tlgMessage = new TelegramMsg();
    String masFromTelegram = "Hello, World!";
    tlgMessage.sendNewMsg(masFromTelegram);
    
  }
}
