package poly.inherit.player;

import poly.inherit.Entity.Monster;
import poly.inherit.Entity.Player;

public class Magician extends Player {
	
	//Player 부모 클래스에 String id 도 포함해서 각각의 Player 자식 클래스에서 쓸 수 있는 방법은 없는지?
	private String id;
	
	public Magician(String id) {
		super("magician", 20, 2, 0, 0);
		this.id = id;
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
