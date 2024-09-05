<br>

## A Interface Supplier do Java: É um Fornecedor de Resultados

**A interface `Supplier<T>` no Java é uma interface funcional que representa um fornecedor de resultados.** Em outras palavras, é uma função que não recebe nenhum argumento, mas retorna um valor de um tipo específico (indicado por `T`).

**Para que serve?**

* **Criar objetos:** É frequentemente utilizada para criar novos objetos, encapsulando a lógica de criação em um `Supplier`.
* **Gerar valores:** Pode ser usada para gerar valores aleatórios, sequências numéricas, ou qualquer outro tipo de dado.
* **Fornecer valores padrão:** Serve para fornecer valores padrão quando um valor não está disponível.

**Como funciona?**

A interface `Supplier` possui um único método abstrato:

```java
T get();
```

Esse método não recebe nenhum argumento e retorna um valor do tipo `T`.

**Exemplo:**

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, World!";
        String message = supplier.get();
        System.out.println(message); // Imprime: Hello, World!
    }
}
```

Neste exemplo, o `Supplier` retorna sempre a mesma string. No entanto, ele pode ser usado para gerar valores diferentes a cada chamada, por exemplo:

```java
Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
```

**Quando usar?**

* **Lambdas e referências a métodos:** A interface `Supplier` é frequentemente usada com lambdas e referências a métodos para criar expressões concisas e funcionais.
* **Streams:** É utilizada em operações de streams para gerar elementos.
* **Construtores:** Pode ser usada para encapsular a lógica de criação de objetos, tornando o código mais modular e testável.

**Benefícios:**

* **Código mais limpo e conciso:** A utilização de `Supplier` permite escrever código mais funcional e expressivo.
* **Reutilização de código:** Um `Supplier` pode ser reutilizado em diferentes partes do código.
* **Flexibilidade:** A interface `Supplier` oferece grande flexibilidade para criar diferentes tipos de fornecedores.

<br>

## Quando a Interface Supplier do Java é Mais Utilizada?

**A interface `Supplier<T>` no Java é uma funcionalidade poderosa que representa um fornecedor de resultados.** Ela é especialmente útil em situações onde você precisa gerar um valor, seja ele um objeto, um número, uma string ou qualquer outro tipo de dado, sob demanda.

**Cenários comuns de uso:**

* **Geração de valores:**
    * **Valores aleatórios:** Criar números aleatórios, strings aleatórias ou objetos aleatórios.
    * **Sequências:** Gerar sequências numéricas, datas ou qualquer outro tipo de sequência.
    * **Objetos:** Instanciar objetos complexos de forma lazy, ou seja, apenas quando necessário.
* **Deferimento de cálculos:**
    * **Resultados caros:** Evitar cálculos complexos ou demorados até que o resultado seja realmente necessário.
    * **Resultados dependentes de contexto:** Gerar resultados com base em informações que só estarão disponíveis no momento da chamada.
* **Streams:**
    * **Geração de streams infinitos:** Criar streams de dados infinitos, como números naturais, letras do alfabeto, etc.
* **Testes:**
    * **Dados de teste:** Fornecer dados de teste para testes unitários ou de integração.

**Exemplo prático:**

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Criando um Supplier para gerar números aleatórios
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);

        // Usando o Supplier para gerar 5 números aleatórios
        for (int i = 0; i < 5; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}
```

**Por que usar Supplier?**

* **Flexibilidade:** Permite definir a lógica de geração de valores de forma declarativa.
* **Laziness:** Adia a execução até que o valor seja realmente necessário, otimizando o desempenho.
* **Reutilizabilidade:** Pode ser reutilizado em diferentes partes do código.
* **Integrabilidade:** Se integra bem com outras funcionalidades do Java 8, como streams e lambdas.

**Em resumo, a interface `Supplier` é uma ferramenta valiosa para:**

* **Abstrair a criação de valores.**
* **Controlar o momento da criação.**
* **Aumentar a flexibilidade e reutilização do código.**

**Quando usar Supplier?**

Sempre que você precisar de um mecanismo para gerar valores sob demanda, a interface `Supplier` é uma excelente opção. Ela é especialmente útil em cenários onde:

* A geração do valor é custosa em termos de tempo ou recursos.
* O valor depende de informações que só estarão disponíveis no momento da chamada.
* Você precisa gerar uma sequência infinita de valores.
* Você quer aumentar a modularidade e a testabilidade do seu código.

**Gostaria de explorar algum desses cenários com mais detalhes ou tem alguma outra pergunta sobre a interface Supplier?**

**Possíveis perguntas:**

* Como usar Supplier com streams?
* Quais são as diferenças entre Supplier e Function?
* Quais são os melhores casos de uso para Supplier?
* Como criar Suppliers complexos?
