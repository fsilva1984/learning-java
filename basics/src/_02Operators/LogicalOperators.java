package _02Operators;

public class LogicalOperators {
public static void main(String[] args) {
  // logical operators

  boolean activeUser = true;
  String contract = "inactive";
  String payment = "ok";
  int age = 40;
  
  // AND -> &&
  if (activeUser && age > 18 ) {
    System.out.println("Access Restrict Area");
  } else {
    System.out.println("Access Denied");
  }



  // OR -> |
  if (contract != "active" ||  payment != "ok") {
    System.out.println("Msg Alert!!");
  }
}
}
