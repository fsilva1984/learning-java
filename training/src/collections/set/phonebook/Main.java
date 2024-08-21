package collections.set.phonebook;

public class Main {
  public static void main(String[] args) {
    PhoneBook phonebook = new PhoneBook();
    phonebook.addContacts("Andre Maia", 2197657867L);
    phonebook.addContacts("Andre Gustavo", 2197557967L);
    phonebook.addContacts("Carmen Santos", 2194652867L);
    phonebook.addContacts("Alex Barone", 2197657899L);
    phonebook.addContacts("Vivian Maia", 2199857865L);


    System.out.println("\n"+phonebook.showContacts()+"\n");
    
    System.out.println(phonebook.searchContact("Andre")+"\n");

    System.out.println(phonebook.contactsUpdate("alex barone", 97945431978L));
  }
}
