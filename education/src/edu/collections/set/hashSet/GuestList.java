package edu.collections.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class GuestList {
	private Set<Invited> guestList;

	// constructor of class
	public GuestList() {
		this.guestList = new HashSet<>();
	}
	
	// add guests
	public void addInvited(String name, long cod) {
		guestList.add(new Invited(name, cod));
		numberOfGuests();
	}

	// guest of number
	public int  numberOfGuests() {
		return guestList.size();
	}
	
	// remove guest
	/*****************************************************************
	 * If the guest is not found in the search, the objNull
	 * method adds a new null guest and returns it.
	 * This way, the guestRemove method can provide an
	 * appropriate response if the invitation code is not present
	 * in the list.
	 * *****************************************************************/
	public Invited  guestRemove(long cod) {
		Invited guestCod = null;
		for (Invited guest : guestList) {
			if (guest.getCod() == cod) {
				guestCod = guest;
				break;
			}
		}
		if (guestCod != null) {
			guestList.remove(guestCod);			
		} else {
			guestCod =  objNull();
		}
		return guestCod;
	}
	
	// object null
	public Invited objNull() {
		Invited guestCod = null;
		addInvited("Convidado não encontrado", 0000000);
		long cod = 0000000L;
		for (Invited guest : guestList) {
			if (guest.getCod() == cod) {
				guestCod = guest;
				break;
			}
		}
		return guestCod;
	}

	// show gusts
	public Set<Invited> showGuest() {
		return guestList;
	}
	
}
