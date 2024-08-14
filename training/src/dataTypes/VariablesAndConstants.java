package dataTypes;

public class VariablesAndConstants {
  public static void main(String[] args) {

    /*
     * type datas variable end constants.
     * constants are written in upper case and with the reserved word final at the
     * beginning of the declaration
     */

    long telephoneNumber = 5555551234L;
    final long SSN = 10161950434L;

    System.out.println(telephoneNumber + "  Original");

    telephoneNumber = 5554653480L;
    System.out.println(telephoneNumber + "  Assigned");

    System.out.println(SSN);

    // SSN = 10161950423L; error: The final local variable SSN cannot be assigned.

  }
}
