package edu.stream.supplier;

import java.util.function.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class SupplierExample {
public static void main(String[] args) {
	
	/*
	 *implements a method and passes it to generate */
	Supplier<String> greeting = () -> "Hello, World!";
	
	List<String> greetingList = Stream.generate(greeting).limit(3).collect(Collectors.toList());
	
	greetingList.forEach(s -> System.out.println(s));
	
	System.out.println("");
	
	// expressão lambda dentro do generate
	List<String> newGreeting = Stream.generate(() -> "OLa Mundo").limit(3).toList();
	
	newGreeting.forEach(System.out::println);
}
}
