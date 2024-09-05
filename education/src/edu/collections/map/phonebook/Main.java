package edu.collections.map.phonebook;

public class Main {
	
	public static void main(String[] args) {
		Phonebook contact = new Phonebook();
		
		contact.addNewContact("João Martinz", 219765477);
		contact.addNewContact("João Moreno", 219765472);
		contact.addNewContact("Jaquelline Martinz", 219765567);
		contact.addNewContact("Gabriel Rocha", 219765876);
		contact.addNewContact("Julho Mendez", 219765425);
		
		System.out.println(contact.searchByName("Gabriel Rocha"));
		
		System.out.println(contact.removeContact("João Moreno"));
		
		contact.showContacts();
		
		
	}
}
