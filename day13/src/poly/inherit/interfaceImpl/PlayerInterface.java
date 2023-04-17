package poly.inherit.interfaceImpl;

import poly.inherit.Entity.Monster;
import poly.inherit.Entity.Player;

public interface PlayerInterface {
	
	boolean isActive(Player player);
	
	void showPhysical(int playerPh);
	
	//잡은 몬스터의 경험치 부여
	public void gainExp(int playerExp, int monsterExp);
	
	//플레이어 체력감소(몬스터의 공격력-플레이어의 방어력)만큼.
	void setPhAfterMonsterAttack(Player player, int monsterAtk);
	
	void hunt(Player player, Monster monster);
	
	void castFireBall(Player player, Monster monster);

	void showMonsterHuntMessage(String monsterName);
	void showMonsterCastFireBallMessage(String monsterName);
	void showMonsterAlreadyDeadMessage(String monsterName);
	void showMonsterCounterAttackMessage(String monsterName);
	void showWhichMonsterPlayerKilledMessage(String monsterName);
	void showPlayerDeadMesssage();
}
