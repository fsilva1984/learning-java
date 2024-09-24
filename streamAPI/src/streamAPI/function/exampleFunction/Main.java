package streamAPI.function.exampleFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(23, 45, 67, 89, 90, 2);
		
		System.out.println("\n So imprimir com o for normal");
		for(Integer n : numbers) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n So imprimindo com o forEach");
		numbers.forEach(System.out::println);
		
		System.out.println("\n modoficando a lista de numeros");
		// implementando a interface Function para realizar uma acao sobre um numero
		Function<Integer, Integer> multiply = n -> {
			return n * 2;
		};
		
		/*
		 * aqui a variavel multiplyList aponta para uma nova lista de inteiros
		 * ciados apartir da iteracao da lista  numbers, que atraves do stream API
		 * podemos chamar o metodo map para mapiar a lista e aplicar o metodo criado
		 * com a interface Function sobre cada numero da lista, e com o toList criaremos uma nova
		 * lista de numeros inteiros multiplicados por 2*/
		List<Integer> multiplyList = numbers.stream().map(multiply).toList();
		multiplyList.forEach(System.out::println);
		
		
		System.out.println("\nRetornando uma lista de doubles");
		
		/*
		 * Usando o metodo reference podemos redduzir significamente a escrita do codigo
		 * */
		List<Double> doubleList = numbers.stream().map(Double::valueOf).toList();
		
		doubleList.forEach(System.out::println);
	}
}













