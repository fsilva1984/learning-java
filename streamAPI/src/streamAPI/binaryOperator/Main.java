package streamAPI.binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(32, 26, 67, 54, 18);
		
		BinaryOperator<Integer> sumNumbers = Integer::sum;
		int result = numberList.stream().reduce(0, sumNumbers);
		System.out.println(result);
	}
}
