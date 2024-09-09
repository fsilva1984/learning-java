package stream.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    // An example of using the function interface

    // integer list
    List<Integer> numbers = Arrays.asList(23, 56, 78, 90);

    /*********************************************************************************
     * the functional interface accepts an argument and returns a result
     * here it accepts an argument of type Integer and returns a result also of type
     * Integer
     **********************************************************************************/
    Function<Integer, Integer> multiply = n -> n * 2;

    /*
     * Analyzing the line of code in Java.
     * 
     * List<Integer> multiplyList =:
     * Declares a new list called multiplyList of type List<Integer>, which will
     * store the result of the operation.
     * 
     * numbers is an existing list containing integers.
     * .stream(): Converts the list numbers into a Java 8 stream. A stream is a
     * sequence of elements that allows parallel processing and functional
     * operations.
     * 
     * .map(multiply):
     * .map( ): Applies the function specified inside the parentheses to each
     * element of the stream.
     * multiply: Refers to the `multiply´ function defined previously, which
     * multiplies an integer by 2.
     * Therefore, this part applies multiplication by 2 to each element of the
     * stream generated from the list numbers.
     * 
     * .collect(Collectors.toList()):
     * .collect( ): Collects the results of the mapping into a new collection.
     * Collectors.toList(): Specifies that the resulting collection should be a
     * list.
     */
    List<Integer> multiplyList = numbers.stream().map(multiply).collect(Collectors.toList());
    multiplyList.forEach(System.out::println);
    // System.out.println(multiplyList);

    System.out.println("");

    // simplifying
    List<Integer> newMultiplyList = numbers.stream().map(n -> n * 2).toList();
    newMultiplyList.forEach(System.out::println);
  }
}
