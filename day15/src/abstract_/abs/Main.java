package abstract_.abs;

public class Main {
	
	public static void main(String[] args) {
		
		//상속을 전제로 만든 PopupStore은 객체생성이 불가능하다
		//Cannot instantiate the type PopupStore
//		PopupStore ps = new PopupStore();
		
		Store st = new Store();
		
		st.orderApple();
		st.orderOrange();
		st.orderGrape();
		
		st.refund();
		
	}

}
