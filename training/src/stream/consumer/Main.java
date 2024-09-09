package stream.consumer;

import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(23, 2, 33, 46, 54, 13, 71);

    // implementing a `Consumer`
    Consumer<Integer>  evenNumber = n -> {
      if(n % 2 == 0) {
        System.out.println(n);
      }
    };

    numbers.stream().forEach(evenNumber);

    System.out.println("");
    
    // simplifying
    numbers.stream().forEach(n -> {
      if (n % 2 == 0) {
        System.out.println(n);
      }
    });
  }
}
