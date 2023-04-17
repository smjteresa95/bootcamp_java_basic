package abstract_.nonabs;

public class Main {
	public static void main(String[] args) {
		
		//2가지 문제점 체크
		
		//1. 상속 목적으로 만든 PopupStore의 객체 생성가능
		PopupStore ps = new PopupStore();
		
		//2. 오버라이딩이 강요가 되지 않아 오버라이딩이 필요한 메서드 누락
		Store s = new Store();
		
		s.orderApple();
		s.orderOrange();
		s.orderGrape();
		
		
	}
}
