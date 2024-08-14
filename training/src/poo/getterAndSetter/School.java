package getterAndSetter;

import java.util.Scanner;

public class School {
  public static void main(String[] args) {
    Student student = new Student();
    Scanner sc = new Scanner(System.in);

    System.out.println("Nome do aluno:");
    String name = sc.nextLine();
    student.setName(name);

    System.out.println("Idade:");
    int age = sc.nextInt();
    student.setAge(age);

    System.out.println("numero do CPF sem pontuação ou traço:");
    long nss = sc.nextLong();
    student.setNss(nss);
    
    System.out.println("Endereço numero e bairro:");
    String addrs = sc.nextLine();
    student.setaddrs(addrs);
    
    System.out.println("Sexo do aluno:");
    String sex = sc.next();
    student.setSex(sex);

    sc.close();

    System.out.println("");
    System.out.println("Nome: " + student.getName());
    System.out.println("Idade: " + student.getAge());
    System.out.println("CPF: " + student.getNss());
    System.out.println("Endereço: " + student.getaddrs());
    System.out.println("Status: " + student.getStatus());
    System.out.println("Sexo do aluno: "+student.getSex());

  }
}
