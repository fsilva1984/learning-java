package enums;

public class RegistrationSystem {
  public static void main(String[] args) {
   
    for(StatesBrazilian state : StatesBrazilian.values()) {
      System.out.println(state.getState()+" - "+state.getAcronym());
    }
  }
}
