package poly.noinherit.user;

import poly.noinherit.monster.Ghost;

public class Magician {
	private String userType;
	private String id;
	private int hp; //체력
	private int atk; //공격
	private int def; //방어
	private int exp; //경험치
	
	public Magician(String id) {
		this.userType = "magician";
		this.id=id;
		this.hp = 20;
		this.atk = 1;
		this.def = 5;
		this.exp =0;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("0 physical. Need to recharge");
		} else {
			this.hp=hp;
		}
	}
	
	public void showStatus() {
		System.out.printf("Magician id: %s, physical: %d, defense: %d, experience %d\n", id, hp, atk, def, exp);
		System.out.println("-----------------------------------------------------------");
	}
	
	public boolean isMagicianHasHp() {
		return this.hp>0 ? true : false;
	}
	
	//Ghost를 공격하면 user 체력에서 ghost 공격(5)만큼 빼기죽이면 경험치 5 증가
	public void attackGhost(Ghost ghost) {
		
		//Ghost 살아있고 Magician체력이 0이 아닐 때
		if(ghost.isGhostActive() && isMagicianHasHp()) {
			
			this.hp-=ghost.getAtk();
			
			if(ghost.isGhostActiveAfterAttack(this.atk)) {
				System.out.println("You've attacked a Ghost.");
				System.out.println("Ghost hp: "+ ghost.getHp());
			} 
			else {
				this.exp += this.def;
				System.out.println("Congrats! you've killed the Ghost.");
			}
			
		} 
		else if (!isMagicianHasHp()) {
			System.out.println("0 physical. Can't attack Ghost.");
			return;
		}
		
		else if(!ghost.isGhostActive()) {
			System.out.println("Ghost already been killed");
			return;
		}
	}
}
	
	

