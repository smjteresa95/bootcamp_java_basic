package poly.noinherit;

import poly.noinherit.monster.Ghost;
import poly.noinherit.user.Magician;

public class MagicianMain {
	public static void main(String[] args) {
		Ghost g1 = new Ghost();
		Magician m1 = new Magician("java_magic");
		
		m1.attackGhost(g1);
		m1.showStatus();
		
		m1.attackGhost(g1);
		m1.showStatus();
		
		m1.attackGhost(g1);
		m1.showStatus();
		
	}

}
