package abstract_.nonabs;

public class Store extends PopupStore{
	
	@Override
	public void orderApple() {
		System.out.println("Apple Juice availble: 20,000");
	}
	
	@Override
	public void orderOrange() {
		System.out.println("Orange Juice availabel: 24,000");
	}

	//실수로 OrderGrape 누락
//	@Override
//	public void orderGrape() {
//		System.out.println("Grape Juice available: ");
//	}

}
