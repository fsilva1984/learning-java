# Generics Type

 * Um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
 * O símbolo <> é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
 
 Em resumo quando precisamos criar um tipo generico de objeto podemos utilizalo.
 um caso bem comum onde se vê o diamond, é na tipagem das Listas, exemplo de lista sem o generic

 List listaSemGeneric = new ArrayList();, e a lista com o generic List<Integer> listaComGeneric = new ArrayList();
 no primeiro exemplo temos uma lista que pode conter variados tipos, enquanto que no segundo exeplo, teremos uma lista pre definida que suporta apenas numeros inteiros.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
