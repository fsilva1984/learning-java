package test;

import javax.swing.JOptionPane;

public class TestWindow {

  public static void main(String[] args) {
    // Pergunta que será exibida na janela
    String mensagem = "Você deseja continuar?";
    // Título da janela
    String titulo = "Confirmação";

    // Exibe a caixa de diálogo de confirmação
    int resposta = JOptionPane.showConfirmDialog(null,
        mensagem, titulo, JOptionPane.YES_NO_OPTION);

    // Verifica a resposta do usuário
    if (resposta == JOptionPane.YES_OPTION) {
      System.out.println("Usuário escolheu SIM.");
    } else if (resposta == JOptionPane.NO_OPTION) {
      System.out.println("Usuário escolheu NÃO.");
    } else {
      System.out.println("A caixa de diálogo foi fechada.");
    }
  }
}
