package com.br.dio.dominio;

import java.util.*;

public class Dev {

  private String nome;
  private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  // **METODOS**
  public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudosIncritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevIncritos().add(this);
  }
  
  public void progresso() {
    Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
    if (conteudo.isPresent()) {
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosIncritos.remove(conteudo.get());
    } else {
      System.err.println("Não tem conteudo inscrito");
    }
  };

  public int calcularXP() {
    return this.conteudosConcluidos.stream().mapToInt(Conteudo::calcularXP).sum();
  }

  // **GETTERS SND SETTERS**
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosIncritos() {
    return conteudosIncritos;
  }

  public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
    this.conteudosIncritos = conteudosIncritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }

  // **EQUALS AND HASCODE**
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((conteudosIncritos == null) ? 0 : conteudosIncritos.hashCode());
    result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dev other = (Dev) obj;
    if (conteudosIncritos == null) {
      if (other.conteudosIncritos != null)
        return false;
    } else if (!conteudosIncritos.equals(other.conteudosIncritos))
      return false;
    if (conteudosConcluidos == null) {
      if (other.conteudosConcluidos != null)
        return false;
    } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
      return false;
    return true;
  };


  
}
