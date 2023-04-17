package poly.noinherit.monster;

public class Ghost {
	
	private int hp;
	private int atk;
	private int def;
	
	public Ghost() {
		this.hp = 3;
		this.atk = 5;
		this.def = 1;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp=hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public boolean isGhostActive() {
		return (this.hp > 0) ? true: false;
	}
	
	//ghost 체력 user 의 공격만큼 감소. 
	public boolean isGhostActiveAfterAttack(int userAtk) {
		this.hp -= userAtk;
		return this.hp > 0 ? true :  false;
	}

}
