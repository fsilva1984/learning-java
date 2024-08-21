package edu.collection.list.sortingLists.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		SortByAge[] persons = new SortByAge[6];
		
		persons[0] = new SortByAge("Carlos", "Masculino", 40);
		persons[1] = new SortByAge("Marcia", "Feminino", 32);
		persons[2] = new SortByAge("Aline", "Feminino", 21);
		persons[3] = new SortByAge("Daniel", "Masculino", 47);
		persons[4] = new SortByAge("Barone", "Masculino", 36);
		persons[5] = new SortByAge("Nadia", "Feminino", 24);
		
		
		System.out.println(
		        "\n---------------------------------------------\n");
		    System.out.println(
		        "** ORGANIZANDO POR IDADE EM ORDEM NUMERICA CRESCENTE **\n");
		    Arrays.sort(persons);
		    for (SortByAge person : persons) {
		    	String InNumericalOrder = String.format("Nome: %s, Genero: %s, Idade: %d",
		    			person.getName(), person.getGender(), person.getAge());
				System.out.println(InNumericalOrder);
			}
		    
		    
		    System.out.println(
			        "\n---------------------------------------------\n");
			    System.out.println(
			        "** ORGANIZANDO POR NOME EM ORDEM ALFABETICA **\n");
			    
			    Comparator<SortByAge> names = new SortByNames();
			    Arrays.sort(persons, names);
			    for (SortByAge person : persons) {
			    	String InAlphabeticalOrder = String.format("Nome: %s, Genero: %s, Idade: %d",
			    			person.getName(), person.getGender(), person.getAge());
					System.out.println(InAlphabeticalOrder);
				}
			    
			    
			    System.out.println(
				        "\n---------------------------------------------\n");
				    System.out.println(
				        "** ORGANIZANDO POR GENERO EM ORDEM ALFABETICA **\n");
				    
				    Comparator<SortByAge> gender = new SortByGenders();
				    Arrays.sort(persons, gender);
				    for (SortByAge person : persons) {
				    	String InAlphabeticalOrder = String.format("Nome: %s, Genero: %s, Idade: %d",
				    			person.getName(), person.getGender(), person.getAge());
						System.out.println(InAlphabeticalOrder);
					}
	}
}











