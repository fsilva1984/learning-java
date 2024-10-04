package com.br.dio.dominio;

public class Main {

  public static void main(String[] args) {
    Curso c1 = new Curso();
    c1.setTitulo("Java para Iniciantes");
    c1.setDescricao("Java estrutura basica");
    c1.setCargaHoraria(75);

    System.out.println("\n" + c1.toString() + "\n");

    Mentoria m1 = new Mentoria();
    m1.setTitulo("Como desenvolver em java");
    m1.setDescricao("pensando como um programador java");

    System.out.println(m1.toString() + "\n");

    Bootcamp bootcampJava = new Bootcamp();
    bootcampJava.setNome("Bootcamp Java SE");
    bootcampJava.setDescricao("Java primeiros passos");
    bootcampJava.getConteudos().add(c1);
    bootcampJava.getConteudos().add(m1);

    System.out.println(bootcampJava.toString() + "\n");
    

    Dev devFlavio = new Dev();
    devFlavio.setNome("Flavio");
    devFlavio.inscreverBootcamp(bootcampJava);    

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcampJava);


  }
}
