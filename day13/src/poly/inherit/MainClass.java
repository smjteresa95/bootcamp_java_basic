package poly.inherit;

import poly.inherit.Entity.Monster;
import poly.inherit.Entity.Player;
import poly.inherit.monster.Rabbit;
import poly.inherit.monster.Rat;
import poly.inherit.player.Knight;
import poly.inherit.player.Magician;
import poly.inherit.player.Warrior;

public class MainClass {
	public static void main(String[] args) {
		Monster Rab1 = new Rabbit();
		Monster Rat1 = new Rat();
		
		Warrior war1 = new Warrior("java_warrior");
		
		
//		war1.hunt(Rat1);
//		war1.showStatus();
//		
//		war1.hunt(Rat1);
//		war1.showStatus();
//		
//		war1.hunt(Rat1);
//		war1.showStatus();
//		
//		war1.hunt(Rat1);
//		war1.showStatus();
//		
//		Knight kng1 = new Knight("black_knight");
//		kng1.showStatus();
		
		
		Magician mag1 = new Magician("java_magic");
		
		mag1.hunt(mag1, Rat1);
		Rat1.showStatus();
		mag1.showStatus();
		
		mag1.castFireBall(mag1, Rat1);
		mag1.showStatus();
		
		mag1.hunt(mag1, Rat1);
		mag1.showStatus();
		
		mag1.hunt(mag1, Rat1);
		mag1.showStatus();
		
//		Player kng1 = new Knight("dark_Knight");
//		
//		kng1.showStatus();
//		
//		kng1.hunt(kng1,Rat1);
//		kng1.showStatus();
//		
//		kng1.hunt(kng1,Rat1);
//		kng1.showStatus();
//		
//		kng1.hunt(kng1,Rat1);
//		kng1.showStatus();
//		
//		kng1.hunt(kng1,Rat1);
//		kng1.showStatus();
		
		
		
		
		
		
						
	}

}
