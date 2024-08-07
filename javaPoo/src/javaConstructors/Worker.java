package javaConstructors;

public class Worker {

  public static void main(String[] args) {
    Person p1 = new Person("Flavio", "101.619.504-53");
    p1.setAge(40);
    p1.setAddrs("Rua Major Motta, 10");
    
    System.out.println("Nome: "+p1.getNAME());
    System.out.println("Numero CPF: "+p1.getNSS());
    System.out.println("Idade: "+p1.getAge());
    System.out.println("Endereço: "+p1.getAddrs());

    System.out.println("");


    Person p2 = new Person("Roger", "123.345.56-78");
    p2.setAge(35);
    p2.setAddrs("Rua tres Marias, 1900");
  
    System.out.println("Nome: "+p2.getNAME());
    System.out.println("Numero CPF: "+p2.getNSS());
    System.out.println("Idade: "+p2.getAge());
    System.out.println("Endereço: "+p2.getAddrs());

  }

}
