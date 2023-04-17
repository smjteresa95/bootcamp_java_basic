package human;

public class Student extends Human {
	
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
//
//	@Override
//	public void introduction() {
//		System.out.printf("My name is %s, %d years old.", name, age);
//		System.out.println(" I'm studying "+ major);		
//	}
}
