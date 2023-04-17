package poly.noinherit;

import poly.noinherit.monster.Rabbit;
import poly.noinherit.user.Warrior;

public class Main2 {
	public static void main(String[] args) {
		
		Rabbit rab1 = new Rabbit();
		Rabbit rab2 = new Rabbit();
		
		Warrior war1 = new Warrior("java_war");
		
		war1.showStatus();
		
		war1.huntRabbit(rab1);
		war1.showStatus();
		
		war1.huntRabbit(rab1);
		war1.showStatus();
	}

}
