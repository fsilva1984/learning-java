package candidateSelection;

import java.util.concurrent.ThreadLocalRandom;

public class CandidateSelection {
  public static void main(String[] args) {
    analyzeCandidates();
  }

  static void contactTheCandidate(String candidateName) {
    int i = 0;
    
    System.out.println("LIGANDO PARA O CANDIDATO(A): "+candidateName);
    while (i < 3) {
      int attempt = ThreadLocalRandom.current().nextInt(1, 12);
      //boolean bool = ;
      if (attempt % 2 == 0) {
        System.out.println("LIGAÇÃO COMPLETADA");
        i = 3;
      } else {
        System.out.println("TENTANDO CONTATO");
        i++;
      }
    }

  }

  static void selectCandidate(String candidateName, double intendedSalary) {
    double salaryBase = 2000.0F;

    if (salaryBase > intendedSalary) {
      String msg = String.format("LIGAR PARA O CANDIDATO(A), %s, SALARIO PRETENDIDO: %.1f", candidateName, intendedSalary);
      System.out.println(msg);
      contactTheCandidate(candidateName);

    } else if (salaryBase == intendedSalary) {
      String msg = String.format("LIGAR PARA O CANDIDATO(A), %s, SALARIO PRETENDIDO: %.1f, COM UMA CONTRA PROPOSTA",
          candidateName, intendedSalary);
      System.out.println(msg);
      contactTheCandidate(candidateName);

    } else {
      System.out.println("AGUARDAR OS DEMAIS CANDIDATOS");
    }
  }

  static double intendedValue() {
    return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
  }

  static void analyzeCandidates() {
    String[] candidates = {
        "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE" };

    for (String candidate : candidates) {
      selectCandidate(candidate, intendedValue());
    }

  }

}
