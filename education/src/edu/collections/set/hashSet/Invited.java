package edu.collections.set.hashSet;

public class Invited {
	private String name;
	private long cod;
	public Invited(String name, long cod) {
		super();
		this.name = name;
		this.cod = cod;
	}
	public String getName() {
		return name;
	}
	
	public long getCod() {
		return cod;
	}
	
	@Override
	public String toString() {
		return " Invited name: " + name + ", cod: " + cod + "\n";
	}
	
	
}
