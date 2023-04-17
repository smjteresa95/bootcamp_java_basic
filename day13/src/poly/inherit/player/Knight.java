package poly.inherit.player;

import poly.inherit.Entity.Player;

public class Knight extends Player {
	
	private String id;
	
	public Knight(String id) {
		super("Knight", 10, 3, 3, 0);
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
