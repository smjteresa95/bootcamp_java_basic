package example.overload;

public class Human {
	String name;
	int age;
	
	public Human(){
		this.name = "default name";
		this.age = 20;
	}
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
}
