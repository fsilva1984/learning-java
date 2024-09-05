package edu.collections.map.orderedMapStructure;

import java.util.*;
import java.time.LocalDate;

public class Agenda {
	
	// private method
	private Map<LocalDate, Events> event;

	// constructor
	public Agenda() {
		super();
		this.event = new TreeMap<>();
	}
	
	// add new events
	public void addEvent(LocalDate date, String events, String local) {
		event.put(date, new Events(events, local));
	}
	
	// show agenda
	public void showAgenda() {
		System.out.println(event);
	}
	
	// next event
	/**************************************************************************
	 * This method shows all events with a date after the current date.
	 * *************************************************************************/
	public void nextEvent() {
		LocalDate dateNow = LocalDate.now();
		LocalDate nextDate = null;
		Events next_event = null;
		for (Map.Entry<LocalDate, Events> entry : event.entrySet()) {
			if (entry.getKey().isEqual(dateNow) || entry.getKey().isAfter(dateNow)) {
				nextDate = entry.getKey();
				next_event = entry.getValue();
				System.out.println("Scheduled Events: " + next_event + "expected date: " + nextDate);
			}
		}
		
	}
	
	// previous events
	/**************************************************************************
	 * This method shows all events with a date before the current date
	 * *************************************************************************/
	public void previousEvents() {
		LocalDate dateNow = LocalDate.now();
		LocalDate previousDate = null;
		Events previous_event = null;
		for (Map.Entry<LocalDate, Events> entry : event.entrySet()) {
			if (entry.getKey().equals(dateNow) || entry.getKey().isBefore(dateNow)) {
				previousDate = entry.getKey();
				previous_event = entry.getValue();
				System.out.println("\n" + "Scheduled Events: " + previous_event + "expected date: " + previousDate);
			}
		}
		
	}
	
	
}



