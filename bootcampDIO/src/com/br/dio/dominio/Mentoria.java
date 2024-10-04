package com.br.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

  LocalDate date = LocalDate.now();

  public LocalDate getDate() {
    return date;
  }

  @Override
  public String toString() {
    return "Mentoria [\nTitulo: " + getTitulo() +
        "\nDescricao: " + getDescricao() + "\nDate:" + date + "\n]";
  }

  @Override
  public int calcularXP() {
    return xp + 10;
  }

}
