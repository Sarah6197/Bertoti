package pack;

public class Singleton {
	private static Singleton singleton;
	private Singleton (String s) {
		save = s;
	}
	public String save;
	public static Singleton getInstance(String s) {
		if(singleton == null) {
			singleton = new Singleton(s);
		}
		return singleton;
	}
}	
