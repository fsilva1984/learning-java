package edu.collections.set.phonebook;

import java.util.Objects;

public class Phonebook {
private String name;
private long number;
public Phonebook(String name, long number) {
	this.name = name;
	this.number = number;
}
public String getName() {
	return name;
}
public long getNumber() {
	return number;
}
@Override
public String toString() {
	return "Phonebook name: " + name + ", number: " + number + "\n";
}

/// NOTE !
/****************************************************************************
 * we will override the 'equals' method because this method compares
 * values ​​and soon we will need to compare objects in a method that
 * we will implement, in the same way we will override the hashCode
 * method to return only the name value of the object.
 * **************************************************************************/
@Override
public int hashCode() {
	return Objects.hash(name);
}


// NOTE !
/***********************************************************
 * For the equals method to compare two objects,
 * it considers the hashCode of one or more properties
 * of each object. These properties are defined in the
 * hashCode method, which has been overridden
 * **********************************************************/
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Phonebook other = (Phonebook) obj;
	return Objects.equals(name, other.name);
}

}
