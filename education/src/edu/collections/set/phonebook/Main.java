package edu.collections.set.phonebook;

public class Main {
	public static void main(String[] args) {
		Contacts contact = new Contacts();
		
		contact.addContact("João Martinz", 219765477);
		contact.addContact("João Miguel", 219785477);
		contact.addContact("João Pedreiro", 219765472);
		contact.addContact("Beatriz  Munhos", 219765467);
		contact.addContact("Jane Melo", 219765484);
		
		System.out.println(contact.showContacts());
		
		System.out.println(contact.removeContac("João Miguel"));
		
		System.out.println(contact.searchContact("João"));
	}
	
}