package poly.inherit.player;

import poly.inherit.Entity.Player;
import poly.inherit.interface_.PlayerInterface;

public class Magician extends Player implements PlayerInterface{
	
	//Player 부모 클래스에 String id 도 포함해서 각각의 Player 자식 클래스에서 쓸 수 있는 방법은 없는지?
	private String id;
	
	public Magician(String id) {
		super("magician", 20, 5, 10, 1);
		this.id = id;
	}
	
	@Override
	public void showStatus() {
		System.out.printf("[%d] id: %s, physical: %d, defense: %d, experience %d\n", this.id, getUserType(), getPh(), getAtk(), getDef(), getExp());
		System.out.println("-----------------------------------------------------------");
	}
	
	
	
}
