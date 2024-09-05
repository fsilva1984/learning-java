package edu.stream.consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String[] args) {
   
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    /************************************************************
     * declaring a lambda expression to use in (stream api)
     *  outside of ForEach
     * ***********************************************************/
    Consumer<Integer> imprimirNumeroPar = num -> {
      if (num % 2 == 0) {
        System.out.println(num);
      }
    };

    numbers.stream().forEach(imprimirNumeroPar);
    
    
    System.out.println("");
    
    
    List<Integer> numbers2 = Arrays.asList(17, 24, 32, 40, 51);
/*******************************************************************
 * declaring a lambda expression to use in (stream api) 
 * inside ForEach
 * ******************************************************************/
    numbers2.stream().forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer num) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
    	
    } );
    
    System.out.println("\n");
    
    List<Integer> numbers3 = Arrays.asList(18, 241, 32, 14, 13);
    /************************************************************
     * declaring a lambda expression to use in (stream api)
     * inside ForEach, simplified
     * ***********************************************************/
    numbers3.stream()
    	.filter(n -> n % 2 == 0)
    	.forEach(System.out::println);
    
  }

}
