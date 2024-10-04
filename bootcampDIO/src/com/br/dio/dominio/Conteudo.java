package com.br.dio.dominio;

public abstract class  Conteudo {

  private String titulo;
  private String descricao;
  public int xp = 10;

  public abstract int calcularXP();

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getXP() {
    return xp;
  }
  
}
