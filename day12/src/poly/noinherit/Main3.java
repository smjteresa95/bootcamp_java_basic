package poly.noinherit;

import poly.noinherit.monster.Rat;
import poly.noinherit.user.Warrior;

public class Main3 {

	public static void main(String[] args) {
		//Rat 2마리 만들어서 한마리를 사냥하는 상황을 만들어주세요
		
		Rat r1 = new Rat();
		Rat r2 = new Rat();
		
		Warrior w1 = new Warrior("ihpre");
		
		w1.showStatus();
		
		w1.huntRat(r1);
		w1.showStatus();
		
		w1.huntRat(r1);
		w1.showStatus();
		
		w1.huntRat(r1);
		w1.showStatus();
		
		w1.huntRat(r1);
		w1.showStatus();
	}
}
