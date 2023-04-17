package human;

public class Human {
	private String name;
	private int age;
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void introduction() {
		System.out.printf("My name is %s, %d years old.", name, age);
	}

	public void coding() {
		System.out.println("코딩 못합니다.");
	}
}
