package edu.collections.set.phonebook;

import java.util.HashSet;
import java.util.Set;

public class Contacts {
	private Set<Phonebook> phonebook;

	public Contacts() {
		super();
		this.phonebook = new HashSet<>();
	}
	
	// method add new contact
	public void addContact(String name, long number) {
		phonebook.add(new Phonebook(name, number));
	}
	
	// remove a contact
	public Phonebook removeContac(String name) {
		Phonebook contactToRemove = null;
		if (!phonebook.isEmpty()) {
			for (Phonebook contact : phonebook) {
				if (contact.getName() == name) {
					contactToRemove = contact;
				}
			}
		}
		phonebook.remove(contactToRemove);
		return contactToRemove;
	}
	
	// search a contact
	public Set<Phonebook> searchContact(String name) {
		Set<Phonebook> search = new HashSet<>();
		if (!phonebook.isEmpty()) {
			for (Phonebook contact : phonebook) {
				if (contact.getName().startsWith(name)) {
					search.add(contact);
				}
			}
		}
		return search;
	}
	
	// show contact
	public Set<Phonebook> showContacts() {
		return phonebook;
	}
	 
}



















