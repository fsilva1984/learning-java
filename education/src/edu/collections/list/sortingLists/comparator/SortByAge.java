package edu.collections.list.sortingLists.comparator;

public class SortByAge implements Comparable<SortByAge> {
	private String name;
	private String gender;
	private int age;
	public SortByAge(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
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
	@Override
	public int compareTo(SortByAge other) {
		return this.age - other.age;
	}
	
}
