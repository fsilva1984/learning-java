package abstraction;

public abstract class AbstractMsgService {

  // abstract concept

 /*
  * an abstract class does not implement
  * code in its body, but speaks to child
  * classes, which should be done first
  */
  public abstract void sendNewMsg(String msg);

  public abstract void saivehistory(String msg);

}
