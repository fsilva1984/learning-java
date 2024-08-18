package edu.collection.list.sortingLists.comparable;

import java.util.Comparator;
public class RH implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		/**************************************************************
		 * method of comparing names, with the aim of organizing
		 * the names in alphabetical order.
		 * **************************************************************/
		return p1.getName().compareTo(p2.getName());
	}


}
