package edu.collection.list.sortingLists.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
 public static void main(String[] args) {
	 Comparator<Person> names = new RH();
	 
	 
	Person[] persons = new Person[5];
	/****************************************************************************
	 * we will use the Person class that implements the Comparable interface
	 * which has the compareTo method used to rearrange the lists,
	 * we will use generic to create a list of generic objects	
	 * with 5 positions
	 * ************************************************************************* */
	
	persons[0] = new Person("Carlos", "Masculino", 40);
	persons[1] = new Person("Marcia", "Feminino", 32);
	persons[2] = new Person("Aline", "Feminino", 21);
	persons[3] = new Person("Daniel", "Masculino", 47);
	persons[4] = new Person("Barone", "Masculino", 36);
	
	System.out.println(
	        "\n---------------------------------------------\n");
	    System.out.println(
	        "** ORGANIZANDO NOME POR ORDEM ALFABETICA **\n");
	    
	    /************************************************************************
	     * Arrays in java.util use the compareTo method to reorder the lists
	     * according to the instructions that are passed to the method.
	     * ************************************************************************/
	    Arrays.sort(persons, names);
	    for (Person person : persons) {
	    	String InAlphabeticalOrder = String.format("Nome: %s, Genero: %s, Idade: %d",
	    			person.getName(), person.getGender(), person.getAge());
			System.out.println(InAlphabeticalOrder);
		}
	    
	    
		System.out.println(
		        "\n---------------------------------------------\n");
		    System.out.println(
		        "** ORGANIZANDO POR IDADE EM ORDEM NUMERICA CRESCENTE **\n");
		    
		    Arrays.sort(persons);
		    for (Person person : persons) {
		    	String InNumericalOrder = String.format("Nome: %s, Genero: %s, Idade: %d",
		    			person.getName(), person.getGender(), person.getAge());
				System.out.println(InNumericalOrder);
			}
		    
}
}
