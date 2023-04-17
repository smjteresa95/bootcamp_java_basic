package example.overload;

public class HumanMain {
	
	public static void main(String[] args) {
		Human h1 = new Human();
		System.out.println(h1.getName());
		System.out.println(h1.getAge());
		
		Human h2 = new Human("Java", 18);
		
		System.out.println(h2.getName());
		System.out.println(h2.getAge());
		
		Human h3 = new Human();
		
		h3.setAge(30);
		System.out.println(h3.getAge());
	}
	
	
}
