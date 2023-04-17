package abstract_.abs;

//상속만을 목적으로 하는 클래스
public abstract class PopupStore{
	
	/*
	 * 1. 메서드에 abstract을 붙이면 해당 메서드는 추상메서드가 되고
	 * 이 메서드는 반드시 오버라이딩 되어야 한다.
	 * 
	 * 2. 추상메서드는 상속을 목적으로 선언 한 메서드이지,
	 * 실행을 목적으로 선언된 메서드가 아니기 때문에 몸체({})부분이 없고
	 * 선언 마무리도 ;으로 한다. 
	 * 
	 * 3. 일반 클래스에는 추상메서드를 선언 할 수 없다.
	 * 추상메서드가 하나 이상 존재하면 class는 추상 클래스로 선언해야 한다.
	 * 
	 * 4. 추상 클래스 내부에 추상메서드가 하나 이상 존재하면 일반 메서드 선언도 여전히 가능하다. 
	 */
	
	public abstract void orderApple();
	public abstract void orderOrange();
	public abstract void orderGrape();
	
	public void refund() {
		System.out.println("refund processing..");
	}

}
