package heritage;

import encapsulation.MessageService;

public class NewMessagingService extends MessageService {

  /*
   * concept of inheritance, the child class does not 
   * need to implement the same
   * functionalities as the parent class because it 
   * has already received them
   */
  public static void main(String[] args) {
    
    MessageService msg = new MessageService();

    msg.sendMessage("Ola mundo");
  }

 

}
