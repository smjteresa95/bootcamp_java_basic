package abstract_.abs;

public class Store extends PopupStore {
	
	@Override 
	public void orderApple() {
		System.out.println("Apple Juice: $7.0");
	}
	
	@Override
	public void orderOrange() {
		System.out.println("Orange Juice: $7.5");
	}
	
	@Override
	public void orderGrape() {
		System.out.println("Grape Juice: $6.5");
	}
	

}
