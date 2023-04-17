package poly.inherit.interfaceImpl;

import poly.inherit.Entity.Monster;
import poly.inherit.Entity.Player;

public interface MonsterInterface {
	

	//몬스터 사망여부 판단
	boolean isMonsterActive(int monsterPh);
	
	//몬스터가 공격을 당한 후 체력값 (플레이어의 공격력 - 몬스터의 방어력)만큼 체력감소
	void setPhAfterAttacked(Monster monster, int playerAtk);
	
	//다음 공격에 몬스터가 죽는 지 판단하고
	//몬스터가 공격을 당한 경우 (플레이어의 공격력-몬스터의 방어력)만큼 체력감소한다고 했을 때)
	boolean isInactiveAfterNextAttacked(int monsterPh, int playerAtk);
	
	void monsterAttacksUser(Monster monster, Player player);

	


}
