package pack;

public class Test {
	
	public static void main(String[] args) {
	Singleton a = Singleton.getInstance("Hello!");
	Singleton b = Singleton.getInstance("Hey!");
	System.out.println(a.save);
	System.out.println(b.save);
}
}