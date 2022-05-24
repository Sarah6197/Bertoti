package main;

import java.util.ArrayList;
import java.util.List;

public class SetEvent {
	
	private List<observer> channels = new ArrayList<observer>();
	
	public void sub(observer channel) {
		channels.add(channel);
	}
	
	public void unsub(observer channel) {
		channels.remove(channel);
	}
	
	public void notification (observer literarygenres, String message) {
		for (observer channel : channels) {
			if(channels.getClass() == literarygenres.getClass())
				channel.atualizar(message);
		}
	}
}