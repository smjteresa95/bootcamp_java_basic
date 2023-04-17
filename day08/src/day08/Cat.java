 package day08;

//Cat.java
 
public class Cat {
	
	//field
	public String name;
	public int age;
	public String color;
	
	//Constructor
	public Cat(String name, int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	//method
	public void showCatInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
	}
}
