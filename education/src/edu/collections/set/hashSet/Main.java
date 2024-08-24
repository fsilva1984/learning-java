package edu.collections.set.hashSet;

public class Main {
	public static void main(String[] args) {
		GuestList guests = new GuestList();
		
		guests.addInvited("Arthur", 93345218);
		guests.addInvited("Arthur", 93346218);
		guests.addInvited("Zilpa", 93347218);
		guests.addInvited("Naftaly", 93348218);
		guests.addInvited("Anna", 93349218);
		guests.addInvited("Beatriz", 93350218);
		guests.addInvited("Jhon", 93351218);
	
		System.out.println("Total de convidados: "+guests.numberOfGuests()+ "\n");
		
		System.out.println(guests.showGuest());
		
		System.out.println(guests.guestRemove(93346218)+" Convite removido");
		
		System.out.println("\n"+guests.guestRemove(93346212));
	}
}
