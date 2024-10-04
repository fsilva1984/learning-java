package com.br.dio.dominio;

import java.time.LocalDate;
import java.util.*;
public class Bootcamp {
  private String nome;
  private String descricao;

  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);

  private Set<Dev> devIncritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();
  
  
  // **GETTERS AND SETTERS**
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public LocalDate getDataInicial() {
    return dataInicial;
  }
  public LocalDate getDataFinal() {
    return dataFinal;
  }
  public Set<Dev> getDevIncritos() {
    return devIncritos;
  }
  public void setDevIncritos(Set<Dev> devIncritos) {
    this.devIncritos = devIncritos;
  }
  public Set<Conteudo> getConteudos() {
    return conteudos;
  }
  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos.addAll(conteudos);
  }

  // ** TOSTRING **
  @Override
  public String toString() {
    return "Bootcamp [nome=" + nome + ", descricao=" + descricao + ", dataInicial=" + dataInicial + ", dataFinal="
        + dataFinal + ", devIncritos=" + devIncritos + ", conteudos=" + conteudos + "]";
  }


  // **EQUALS AND HASHCODE
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((devIncritos == null) ? 0 : devIncritos.hashCode());
    result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
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
    Bootcamp other = (Bootcamp) obj;
    if (devIncritos == null) {
      if (other.devIncritos != null)
        return false;
    } else if (!devIncritos.equals(other.devIncritos))
      return false;
    if (conteudos == null) {
      if (other.conteudos != null)
        return false;
    } else if (!conteudos.equals(other.conteudos))
      return false;
    return true;
  }

   
}
