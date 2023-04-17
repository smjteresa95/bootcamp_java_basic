package poly.inherit;

import poly.inherit.Entity.Monster;
import poly.inherit.monster.Rabbit;
import poly.inherit.monster.Rat;
import poly.inherit.player.Warrior;

public class Main {
	public static void main(String[] args) {
		Monster rab1 = new Rabbit();
		Monster rat1 = new Rat();
		Warrior w1 = new Warrior("java_warrior");
		
		
		w1.showStatus();
		
		w1.hunt(rab1);
		w1.showStatus();
		
		w1.hunt(rab1);
		w1.showStatus();
		
		w1.hunt(rab1);
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.showStatus();
		
		
		
	}

}
