package day08;

//BasketBallPlayerMain.java

public class BasketBallPlayerMain {
	
	public static void main(String[] args) {
		//create instance p1
		BasketBallPlayer p1 = new BasketBallPlayer("Steven", 29,198,"50K");
		//create instance p2
		BasketBallPlayer p2 = new BasketBallPlayer("Brain", 21, 188, "30K");
		
		p1.showInfo();
		p1.dunkShoot();
		
		p2.showInfo();
		p2.dunkShoot();
	}
}
