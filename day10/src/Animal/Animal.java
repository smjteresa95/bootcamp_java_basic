package Animal;

public class Animal {
	String animalType;
	String makeSound;
	
	public Animal() {
		
	}
	public Animal(String animalType, String makeSound) {
		this.animalType = animalType;
		this.makeSound = makeSound;
	}
	
	public void sound() {
		System.err.println(this.animalType + " makes this sound: "+ this.makeSound);
	}
}
