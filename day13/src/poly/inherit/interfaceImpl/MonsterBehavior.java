package poly.inherit.interfaceImpl;

import poly.inherit.Entity.Monster;
import poly.inherit.Entity.Player;

public class MonsterBehavior implements MonsterInterface{
	
	//몬스터 사망여부 판단
	public boolean isMonsterActive(int monsterPh) {
		return monsterPh>0 ? true : false;
	}

	
	//몬스터 체력차감. 공격당하면 (상대방의 공력력 - 내 방어력)만큼 체력감소
	//이 메서드는 몬스터와 플레이어 양쪽 다 쓸 수 있지 않을까?
	public void setPhAfterAttacked(Monster monster, int playerAtk) {
		monster.setPh( monster.getPh()-(playerAtk - monster.getDef()) );
	}

	//다음 공격에 몬스터가 죽는 지 판단
	//(몬스터가 공격을 당한 경우 플레이어의 공격력만큼 체력감소한다고 했을 때)
	public boolean isInactiveAfterNextAttacked(int monsterPh, int playerAtk) {
		return (monsterPh-playerAtk<=0) ? true : false;
	}
	
	//몬스터가 공격하는 경우, user의 체력이 몬스터의 공격량만큼 감소한다.
	//이 메서드는 수정해야 함.
	public void monsterAttacksUser(Monster monster, Player player) {
		if(isInactiveAfterNextAttacked(monster.getPh(), player.getAtk())) {
			System.out.println(monster.getName() + "Can't attack" + player.getUserType());
		} else {
			player.setPh(player.getPh()-monster.getAtk());
			System.out.println("Monster attacked "+ player.getUserType()+". Physical " +monster.getAtk()+" decreased.");
		}
	}
	

}
