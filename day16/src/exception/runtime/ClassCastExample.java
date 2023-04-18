package exception.runtime;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		Animal a1 = dog;
		dog = (Dog) a1;
		
		System.out.println(new StringBuffer("타입변환성공: Animal -> Dog"));
		
		
		Animal a2 = new Cat();
		Dog d2 = (Dog) a2;
		
		System.out.println(new StringBuffer() );
		
	}
}
