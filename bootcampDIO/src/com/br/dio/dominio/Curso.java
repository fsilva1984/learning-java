package com.br.dio.dominio;

public class Curso extends Conteudo {

  private int cargaHoraria;

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso [\nTitulo: " + getTitulo() +
        "\nDescricao:" + getDescricao() + "\nCargaHoraria: "
        + cargaHoraria + "h" + "\n]";
  }

  @Override
  public int calcularXP() {
    return xp + cargaHoraria;
  }

}
