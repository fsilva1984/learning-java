package streamAPI.opitional;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		
		// tratamento de NullPointerException com 
		String nullableValue = "Default return";
		Optional<String> optionalValue = Optional.ofNullable(nullableValue);
		
		// esta vazio?
		System.out.println(optionalValue.isEmpty());

		// existe algum valor?
		System.out.println(optionalValue.isPresent());
		
		// obter o valor
		System.out.println(optionalValue.get());
		
	}
}
