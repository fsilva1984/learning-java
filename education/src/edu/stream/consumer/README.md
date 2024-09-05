<br>

# Consumer

A interface `Consumer` do Java faz parte do pacote `java.util.function` e é uma das interfaces funcionais fornecidas pela linguagem a partir do Java 8. A interface `Consumer` representa uma operação que aceita um único argumento e não retorna resultado. Em outras palavras, é uma função que consome um dado sem produzir um resultado.

Aqui está uma visão geral da interface `Consumer`:

### Definição da Interface `Consumer`

A interface `Consumer` é definida da seguinte forma:

```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

- **T**: É o tipo do argumento que a operação vai consumir.
- **accept(T t)**: É o método abstrato que deve ser implementado. Este método recebe um argumento do tipo `T` e não retorna nada (o retorno é `void`).

### Como Utilizar a Interface `Consumer`

Você pode utilizar a interface `Consumer` de várias maneiras, principalmente com expressões lambda ou referências a métodos, já que ela é uma interface funcional. Aqui estão alguns exemplos de uso:

#### 1. Usando Expressão Lambda

```java
Consumer<String> printConsumer = s -> System.out.println(s);

printConsumer.accept("Hello, World!");  // Imprime: Hello, World!
```

#### 2. Usando Referência a Método

```java
Consumer<String> printConsumer = System.out::println;

printConsumer.accept("Hello, World!");  // Imprime: Hello, World!
```

### Combinando Consumers

A interface `Consumer` também fornece métodos default que permitem combinar várias operações:

- **andThen(Consumer<? super T> after)**: Retorna um novo `Consumer` que executa a operação atual e depois a operação fornecida como argumento.

```java
Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
Consumer<String> printLowerCase = s -> System.out.println(s.toLowerCase());

Consumer<String> combinedConsumer = printUpperCase.andThen(printLowerCase);

combinedConsumer.accept("Hello, World!");

// Imprime:
// HELLO, WORLD!
// hello, world!
```

### Onde a Interface `Consumer` é Mais Útil

A interface `Consumer` é útil em diversos contextos:

1. **Streams API**: Em operações com Streams, você frequentemente usa `Consumer` para executar uma ação em cada elemento de uma stream. Por exemplo, para imprimir cada elemento de uma lista:

    ```java
    List<String> list = Arrays.asList("A", "B", "C");
    list.forEach(System.out::println);  // Usa um Consumer para imprimir cada elemento
    ```

2. **Coleções e Iteração**: Ao iterar sobre coleções e aplicar ações em cada elemento, `Consumer` é uma escolha natural.

3. **Processamento de Dados**: Quando você precisa processar ou modificar dados sem precisar retornar um valor, `Consumer` pode ser útil. Por exemplo, para atualizar um objeto ou registrar informações.

4. **Callback e Eventos**: Em situações onde você deseja passar uma ação para ser executada posteriormente (como em callbacks), `Consumer` pode ser usado para definir o que deve ser feito quando um evento ocorre.

Esses são alguns exemplos e aplicações práticas da interface `Consumer`. É uma ferramenta bastante flexível e poderosa para programação funcional em Java.