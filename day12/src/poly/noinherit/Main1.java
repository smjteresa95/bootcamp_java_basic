package poly.noinherit;

import poly.noinherit.user.Warrior;

//전사 단독으로 하나 활용하는 경우
public class Main1 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior("war_java");
		
		w1.showStatus();
		
//		w1.huntRabbit();
		w1.showStatus();
		
//		w1.huntRat();
		w1.showStatus();
		
	}
}
