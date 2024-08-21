package collections.set.phonebook;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
  private Set<Contacts> contacts;

  // set constructor
  public PhoneBook() {
    this.contacts = new HashSet<>();
  }

  public Set<Contacts> getContacts() {
    return contacts;
  }

  // add new contact
  public void addContacts(String name, long number) {
    contacts.add(new Contacts(name, number));
  }

  // see contacts
  public Set<Contacts> showContacts() {
    return contacts;
  }

  // search contact
  public Set<Contacts> searchContact(String name) {
    Set<Contacts> auxiliarySet = new HashSet<>();
    for (Contacts contacts : contacts) {
      if (contacts.getName().startsWith(name)) {
        auxiliarySet.add(contacts);
      }
    }
    return auxiliarySet;
  }

  // contact update
  public Contacts contactsUpdate(String name, long number) {
    Contacts updatedContact = null;
    for (Contacts contact : contacts) {
      if (contact.getName().equalsIgnoreCase(name)) {
        contact.setNumber(number);
        updatedContact = contact;
      }
    }
    return updatedContact;
  }
}
