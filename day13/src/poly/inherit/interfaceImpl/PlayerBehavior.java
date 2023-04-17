package poly.inherit.interfaceImpl;

import poly.inherit.Entity.Monster;
import poly.inherit.Entity.Player;

public class PlayerBehavior implements PlayerInterface{
	
	//플레이어가 살았는지(true) 죽었는지(false) 확인 
	//!같이 쓸 수 있는 메서드. 추후에 따로 빼기
	//? 오버로드를 해서 써야 하는 건가?
	public boolean isActive(Player player) {
		return player.getPh()>0 ? true : false;
	}
	
	//인터페이스 내용구현
	public void showPhysical(int playerPh) {
		System.out.println("Your current physical is "+ playerPh);
	}
	
	//플레이어 경험치가 몬스터의 경험치만큼 증가
	public void gainExp(int playerExp, int monsterExp) {
			playerExp += monsterExp;
	}
	
	public void setPhAfterMonsterAttack(Player player, int monsterAtk) {
		//몬스터가 살아있는 지 확인하는 메서드 추가
		//몬스터에게 공격을 받으면 플레이어의 체력은 (몬스터의 공격력-플레이어의 방어력: 감소할 체력)만큼 감소한다.
		//플레이어의 방어력이 몬스터의 공격력보다 높을 경우, 플레이어의 체력이 증가하는 경우가 생길 수 있다. 
		
		
		//몬스터 공격력이 1이상인지 0인지 구분, 체력이 차지 않게 코드 수정
		//playerPh = 
			
			//몬스터의 공격력이 1 이상이고, 감소할 체력이 양수일 경우 
			if(monsterAtk>0 && monsterAtk-player.getDef()>0) {
				player.setPh(monsterAtk-player.getDef());
				
				//플레이어의 체력보다 감소할 체력이 더 큰 경우 플레이어는 죽는다. 
				if(!isActive(player)) {
					showPlayerDeadMesssage();
				}
				
			}
			//몬스터의 공격력이 1 이상이고, 감소할 체력이 음수일 경우 -> 이 경우 체력이 오히려 찬다.
			//player의 공격력이 더 높은거니까 체력은 1만 감소한다. 
			else if(monsterAtk>0 && monsterAtk-player.getDef()<0) {
				player.setPh(player.getPh()-1);
				
				//Player의 방어력은 높은데 체력이 1 감소해서 0으로 바뀌면 플레이어는 죽는다. 
				if(!isActive(player)) {
					showPlayerDeadMesssage();
				}
			}
			//몬스터의 공격력이 0이면 체력이 줄지 않는다.
			else if(monsterAtk==0) {
				return;
			}
			
	}
	
	//MonsterBehavior 에 있는 메소드로 구현하기.
	public void hunt(Player player, Monster monster) {
		//몬스터가 죽은 상태면
		if(!monster.isMonsterActive(monster.getPh())){
			System.out.println(monster.getName()+ " is already dead.");
		}
		else {
			//몬스터를 공격 - 몬스터가 공격을 받음, 몬스터 체력 감소
			showMonsterHuntMessage(monster.getName());
			monster.setPhAfterAttacked(monster, player.getAtk());
			
			//몬스터가 아직 살아 있을 때, 몬스터가 반격한다. 플레이어의 체력이 감소한다.
			if(monster.isMonsterActive(monster.getPh())) {
				showMonsterCounterAttackMessage(monster.getName());
				setPhAfterMonsterAttack(player, monster.getAtk());
			}
			//몬스터가 죽었을 때, 경험치 획득한다.
			else {
				showWhichMonsterPlayerKilledMessage(monster.getName());
				gainExp(player.getAtk(), monster.getExp());
			}
			
		}
	}
	
	//castFireBall이라는 메서드가 있다. 그냥 공격력 2배의 데미지를 입힐 수 있다.
	//몬스터가 반격을 하지 않는다. 
	public void castFireBall(Player player, Monster monster) {
	//몬스터가 죽은 상태면
			if(!monster.isMonsterActive(monster.getPh())){
				System.out.println(monster.getName()+ " is already dead.");
			}
			else {
				//몬스터를 공격 - 몬스터가 공격을 받음, 몬스터 체력 감소
				showMonsterCastFireBallMessage(monster.getName());
				monster.setPhAfterAttacked(monster, player.getAtk());
				//몬스터가 죽었을 때, 경험치 획득한다.
				if(monster.isMonsterActive(monster.getPh())) {
					showWhichMonsterPlayerKilledMessage(monster.getName());
					gainExp(player.getAtk(), monster.getExp());
				}
			}
	}
	
	
	
	
	
	
	public void showMonsterHuntMessage(String monsterName) {
		System.out.println("[Hunt]You attacked "+monsterName);
	}
	
	public void showMonsterCastFireBallMessage(String monsterName) {
		System.out.println("[FireBall]You attacked "+ monsterName);
	}
	
	//위의 둘을 묶어서 showMonsterAttackMessage() 로 하고, 
	//해당 기술이 어떤건지에 따라 메시지창에 다르게 나오게도 할 수 있겠다. 
	
	public void showMonsterAlreadyDeadMessage(String monsterName) {
		System.out.println(monsterName+ " is already dead.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println(monsterName + " counterattacked.");
	}
	
	public void showWhichMonsterPlayerKilledMessage(String monsterName) {
		System.out.println("You've killed the " + monsterName); 
	}
	
	public void showPlayerDeadMesssage() {
		System.out.println("Player is dead. GAME OVER");
	}
	
	
	
	
	


}
