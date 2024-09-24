package streamAPI.predicate.examplePredicate;

import java.util.*;
import java.util.function.Predicate;

public class Main {
	
	public static void main(String[] args) {
		List<String> programmingLanguage = Arrays.asList("Python", "Java", "Javscript", "Go", "Cobol", "F#", "Koten");
		System.out.println("Words Shorter Than Five Letters");
		List<String> wordsShorterThanFiveLetters = programmingLanguage.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String word) {
				return  word.length() < 5;
			}
			
		}).toList();
		
		System.out.println(wordsShorterThanFiveLetters);
		
		System.out.println("\nNumbers Even");
		
		List<Integer> numbersList = Arrays.asList(13, 56, 2, 67, 68, 42);
		List<Integer> multiply = numbersList.stream().filter(n -> n % 2 == 0).toList();
		System.out.println(multiply);
	}
}
