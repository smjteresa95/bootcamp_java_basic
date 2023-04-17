package poly.inherit.player;

import poly.inherit.Entity.Monster;

public class Warrior {

	private String id;
	private int ph; //체력
	private int atk; //공격
	private int def; //방어
	private int exp; //경험치

	
	public Warrior(String id) {
		this.id=id;
		this.ph = 20;
		this.atk = 2;
		this.def = 5;
		this.exp=0;
	}
	
	public void showStatus() {
		System.out.printf("Warrior id: %s, physical: %d, defense: %d, experience %d\n", id, ph, atk, def, exp);
		System.out.println("-----------------------------------------------------------");
	}
	
	//파라미터로 모든 몬스터의 부모인 Monster를 선언하면
	//다형성의 원리에 의해서 상속받은 모든 몬스터가 대입 가능하다.
	public void hunt(Monster monster) {
		//죽은 몬스터는 교전 불가 및 종료
		if(!monster.isMonsterActive()) {
			System.out.println(monster.getName()+" is already dead.");
		} else { //몬스터가 죽지 않은 경우
			//몬스터 공격
			monster.monsterGotAttacked(atk);
		//몬스터가 다음 공격에 죽지 않으면 반격해 플레이어 체력 차감(몬스터의 공격력만큼)
			if(monster.isMonsterActive()) {
				System.out.println("Monster is still alive. Your ph decrease -" + monster.getAtk() +".");
				minusPlayerPh(monster);
			}else {
				//몬스터가 다음 공격에 죽으면 플레이어에게 경험치 부여(몬스터의 경험치만큼)
				System.out.println("You've killed the monster! You've gained exp.");
				plusPlayerExp(monster);
			}	
		}
	}
	
	//플레이어 체력차감(몬스터의 공격력만큼)
	public void minusPlayerPh(Monster monster) {
		this.ph -= monster.getAtk();
	}
	
	//플레이어 경험치 부여(몬스터의 경험치 절반만큼)
	public void plusPlayerExp(Monster monster) {
		exp += monster.getExp();
	}

}
