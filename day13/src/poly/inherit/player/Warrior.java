package poly.inherit.player;

import poly.inherit.Entity.Monster;
import poly.inherit.Entity.Player;

public class Warrior extends Player{

	private String id;
	
	public Warrior(String id) {
		super("Warrior", 20, 2, 5, 0);
		this.id=id;
	}
	
	@Override
	public void showStatus() {
		System.out.printf("[%s: %s]\n", getUserType(), id);
		System.out.printf("physical: %d\n", getPh());
		System.out.printf("attack: %d\n", getAtk());
		System.out.printf("defense: %d\n", getDef());
		System.out.printf("experience %d\n", getExp());
		System.out.println("-----------------------------------------------------------");
	}



}
