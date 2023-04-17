package Animal;

public class Bori extends Dog {
	public static void main(String[] args) {
		Dog bori = new Dog("Bori", 3, "Shiba Inu");
		
		DogActivities dogActivities = new DogActivities();
		dogActivities.setDogName(bori.getDogName());
		dogActivities.playTime();
	}
}
