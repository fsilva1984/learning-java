package edu.collection.list.sortingLists.comparable;

public class Person implements Comparable<Person> {
	private String name;
	private String gender;
	private int age;
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender =gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	 /*
	   * implementing the compareTo method
	   * of the interface
	   * compare by age
	   */
	  @Override
	  public int compareTo(Person other) {
	    return this.age - other.age;
	  }
	
}
