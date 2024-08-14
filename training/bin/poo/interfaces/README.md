
## Quais as diferenças entre classe abstract e interface em java

 Em Java, tanto classes abstratas quanto interfaces são usadas para definir contratos que outras classes devem seguir, mas elas têm diferenças importantes em termos de uso e características. Aqui estão as principais diferenças:

# 1. Métodos e Implementações:
  Classe Abstrata:
 Pode ter métodos abstratos (sem corpo) e métodos concretos (com corpo).
 Métodos abstratos devem ser implementados pelas subclasses.
 Pode conter construtores, que são chamados quando uma subclasse é instanciada.
 Interface:
 Inicialmente, só podia ter métodos abstratos (sem corpo), mas a partir do Java 8, pode ter métodos padrão (default) e métodos estáticos com implementações.
 Não pode ter construtores porque não pode ser instanciada diretamente.
# 2. Herança:
  Classe Abstrata:
 Uma classe pode estender apenas uma única classe abstrata, ou seja, a herança é simples.
 A classe abstrata pode estender outra classe (abstrata ou concreta) e implementar interfaces.
 Interface:
 Uma classe pode implementar várias interfaces, ou seja, suporta herança múltipla.
 Uma interface pode estender outras interfaces, permitindo uma combinação de contratos.
# 3. Variáveis:
  Classe Abstrata:
 Pode ter variáveis de instância, que podem ser usadas por métodos concretos ou abstratos.
 Pode definir variáveis constantes (final), mas também variáveis que não sejam final.
 Interface:
 Pode ter variáveis, mas todas são implicitamente public, static e final (constantes).
# 4. Uso Típico:
  Classe Abstrata:
 Usada quando várias classes compartilham código comum, mas não devem ser instanciadas diretamente.
 É útil quando você tem uma hierarquia de classes onde faz sentido compartilhar algum comportamento comum entre elas.
 Interface:
 Usada para definir um contrato que classes não relacionadas podem seguir.
 Facilita a aplicação de múltiplas funcionalidades a uma classe, permitindo uma forma de herança múltipla.
# 5. Atributos de Acesso:
  Classe Abstrata:
 Métodos e variáveis podem ter qualquer modificador de acesso (private, protected, public, etc.).
 Interface:
 Todos os métodos e variáveis são implicitamente public, a menos que o método seja default ou static.


## Qual a principal diferença entre classe abstract e interface em java.

 A principal diferença entre uma classe abstrata e uma interface em Java é que uma classe abstrata pode ter tanto métodos concretos (com implementação) quanto abstratos (sem implementação), enquanto uma interface originalmente só podia ter métodos abstratos, mas a partir do Java 8, também pode ter métodos com implementação (default e static). Além disso, uma classe pode estender apenas uma classe abstrata, enquanto pode implementar múltiplas interfaces, facilitando a herança múltipla de comportamento.
 