package stream.supplier;

import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    /********************************************************************************
     * Analyzing the Java Code
     * 
     * Supplier<String>: This declares a Supplier object that will provide a String
     * value.
     * () -> "Hello, World!": This is a lambda expression that defines the
     * Supplier's behavior. It takes no arguments and returns the string
     * "Hello, World!".
     * 
     * Stream.generate(greeting): This creates an infinite stream of String values
     * by repeatedly calling the greeting supplier.
     * .limit(3): This limits the stream to the first 3 elements.
     * .toList(): This collects the elements of the stream into a List.
     * 
     * greetingList.forEach(): This iterates over each element in the greetingList.
     * System.out::println: This is a method reference that points to the println
     * method of the System.out object. So, for each element in the list, it prints
     * that element to the console.
     **********************************************************************************/
    Supplier<String> greeting = () -> "Hello, World!";

    List<String> greetingList = Stream.generate(greeting).limit(3).toList();
    greetingList.forEach(System.out::println);

    System.out.println("");

    /*******************************************************************************
     * If you don't want to declare a `Supplier` before, you can pass it directly in
     * the body of generate.
     ********************************************************************************/
    List<String> newGreetingList = Stream.generate(() -> "Olá, Mundo!").limit(3).toList();
    newGreetingList.forEach(System.out::println);
  }
}
