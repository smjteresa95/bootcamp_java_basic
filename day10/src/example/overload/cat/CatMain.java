package example.overload.cat;

public class CatMain {
	
	public static void main(String[] args) {
		Cat c1 = new Cat("Nabi", "Unknown");
		Cat c2 = new Cat();
		
		c1.call();
		c1.call("Kitty");
		
		c2.call();
	}
}
