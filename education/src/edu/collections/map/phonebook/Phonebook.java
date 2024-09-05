package edu.collections.map.phonebook;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
	// private property
	private Map<String, Integer> phonebook;

	// method constructor
	public Phonebook() {
		this.phonebook = new HashMap<>();
	}
	
	// method add contacts
	public void addNewContact(String name, Integer number) {
		phonebook.put(name, number);
	}
	
	// method remove contact
	public Integer removeContact(String name) {
		Integer contact = null;
		if (!phonebook.isEmpty()) {
			contact  = phonebook.get(name);
		}
		return contact;
	}
	
	// show contacts
	public void showContacts() {
		System.out.println(phonebook);
	}
	
	// search by name
	public Integer searchByName(String name) {
		Integer numberContact = null;
		if (!phonebook.isEmpty()) {
			numberContact = phonebook.get(name);
		}
		return numberContact;
	}












}
