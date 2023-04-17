package Animal;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Animal cat1, dog1, pig1;
		
		cat1 = new Cat();
		dog1 = new Dog();
		pig1 = new Pig();
		
		Animal[] animals = {cat1, dog1, pig1};
		
		for(Animal animal: animals) {
			animal.sound();
		}
	}
	

}
