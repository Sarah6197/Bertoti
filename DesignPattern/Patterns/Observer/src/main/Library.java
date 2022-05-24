package main;

public class Library {
	public SetEvent event;
	
	public Library() {
		event = new SetEvent();
	}
	
	public void fantasychange(String message) {
		event.notification(new Fantasy(), message);
	}
	
	public void dystopianchange(String message) {
		event.notification(new Dystopian(), message);
	}
	public void sciencefictionchange(String message) {
		event.notification(new ScienceFiction(), message);
	}
}
