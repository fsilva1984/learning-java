package iphone;

public class Iphone implements Navegador, Telefone, TocadorDeMusicas {

  // funcoes do navegador
  private String abrirPagina;
  private String atualizar;
  private String abrirNovaAba;

  public String getAbrirPagina() {
    return abrirPagina;
  }

  public void setAbrirPagina(String abrirPagina) {
    this.abrirPagina = abrirPagina;
  }

  public String getAtualizar() {
    return atualizar;
  }

  public void setAtualizar(String atualizar) {
    this.atualizar = atualizar;
  }

  public String getAbrirNovaAba() {
    return abrirNovaAba;
  }

  public void setAbrirNovaAba(String abrirNovaAba) {
    this.abrirNovaAba = abrirNovaAba;
  }

  @Override
  public String navegador(String opcao) {
    return opcao;
  };

  public void funcoesDoNevegador(int opcao) {
    switch (opcao) {
      case 1:
        setAbrirPagina("Abrindo pagina da web");
        System.out.println(navegador(getAbrirPagina()));
        break;
      case 2:
        setAbrirPagina("Atualizando pagina da web");
        System.out.println(navegador(getAtualizar()));
        break;
      case 3:
        setAbrirNovaAba("Abrindo nova aba");
        System.out.println(navegador(getAbrirNovaAba()));
        break;
    }
  };

  // funcoes do telefone
  private String chamadas;
  private String correioDeVoz;
  private String receberChamadas;

  public String getCorreioDeVoz() {
    return correioDeVoz;
  }

  public void setCorreioDeVoz(String correioDeVoz) {
    this.correioDeVoz = correioDeVoz;
  }

  public String getChamadas() {
    return chamadas;
  }

  public void setChamadas(String chamadas) {
    this.chamadas = chamadas;
  }

  public String getReceberChamadas() {
    return receberChamadas;
  }

  public void setReceberChamadas(String receberChamadas) {
    this.receberChamadas = receberChamadas;
  }

  @Override
  public String telefone(String opcao) {
    return opcao;
  }

  public void funcoesDoTelefone(int opcao) {
    switch (opcao) {
      case 1:
        setChamadas("Fazendo chamada");
        System.out.println(telefone(getChamadas()));
        break;
      case 2:
        setReceberChamadas("recebendo ligação");
        System.out.println(telefone(getReceberChamadas()));
        break;
      case 3:
        setCorreioDeVoz("Deixando recado no correio de voz");
        System.out.println(telefone(getCorreioDeVoz()));
        break;
    }
  };

  // funcoes do tocador de musicas
  private String tocarMusica;
  private String pausarMusica;
  private String SelecionarMusica;

  public String getTocarMusica() {
    return tocarMusica;
  }

  public void setTocarMusica(String tocarMusica) {
    this.tocarMusica = tocarMusica;
  }

  public String getPausarMusica() {
    return pausarMusica;
  }

  public void setPausarMusica(String pausarMusica) {
    this.pausarMusica = pausarMusica;
  }

  public String getSelecionarMusica() {
    return SelecionarMusica;
  }

  public void setSelecionarMusica(String selecionarMusica) {
    SelecionarMusica = selecionarMusica;
  }

  @Override
  public String tocadorDeMusicas(String opcao) {
    return opcao;
  }

  public void funcoesDoTocadorDeMusicas(int opcao) {
    switch (opcao) {
      case 1:
        setSelecionarMusica("Selecionando musica");
        System.out.println(getSelecionarMusica());
        break;
      case 2:
        setTocarMusica("Tocando Musica");
        System.out.println(tocadorDeMusicas(getTocarMusica()));
        break;
      case 3:
        setPausarMusica("Pausando musica");
        System.out.println(tocadorDeMusicas(getPausarMusica()));
        break;
    }
  };
}
