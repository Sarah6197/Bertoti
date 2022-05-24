package main;

public class App {
	public static void main(String[] args) {
		Library Library42 = new Library();
		
		Library42.event.sub(new Dystopian());
		Library42.event.sub(new Dystopian());
		Library42.event.unsub(new Dystopian());
		Library42.event.sub(new Fantasy());
		Library42.event.sub(new Fantasy());
		Library42.event.unsub(new Fantasy());
		Library42.event.sub(new ScienceFiction());


		
		
		Library42.fantasychange("New Book!✧｡٩(ˊᗜˋ)و✧*｡");
		Library42.dystopianchange("(｢๑•₃•) New Book!｢");
		Library42.sciencefictionchange("New Book! (୨୧•͈ᴗ•͈)");
	}
}
