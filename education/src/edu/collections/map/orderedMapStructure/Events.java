package edu.collections.map.orderedMapStructure;

public class Events {
	private String event;
	private String local;
	public Events(String event, String local) {
		super();
		this.event = event;
		this.local = local;
	}
	public String getLocal() {
		return local;
	}
	public String getEvent() {
		return event;
	}
	@Override
	public String toString() {
		return "event: " + event + ", local: " + local + "\n";
	}
	
}
