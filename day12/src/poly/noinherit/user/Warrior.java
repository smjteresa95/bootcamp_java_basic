package poly.noinherit.user;

import poly.noinherit.monster.Rabbit;
import poly.noinherit.monster.Rat;

public class Warrior {
	//정보은닉 적용
	private String userType;
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	//생성자
	public Warrior(String id) {
		this.userType="warrior";
		this.id=id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp =0;
	}
	
	public void showStatus() {
		System.out.printf("id: %s, physical: %d, attack: %d, defense: %d, exprience: %d\n", id, hp, atk, def, exp);
		System.out.println("--------------------------------------------------------");
	}
	
//	//단독적으로 사냥을 하도록 메서드를 만든다
//	public void huntRabbit() {
//		System.out.println("you've hunted rabbit");
//		this.exp += 5;
//	}
	
	//내가 공격한 rabbit의 체력을 3을 깎는다. 
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp()<=0) {
			System.out.println("Rabbit already been killed");
			return;
		}
		//내가 공격한 rabbit의 체력을 3을 깎는다. 
		rabbit.setHp(rabbit.getHp() - this.atk);
		
		if(rabbit.getHp() <=0) {
			System.out.println("You've killed rabbit");
			this.exp+=5;
		}else {
			System.out.println("You've attacked rabbit");
		}
	}
	
	public void huntRat(Rat rat) {
		
//		//죽었는지 안죽었는지 검사
//		if(rat.getHp()<0) {
//			System.out.println("Rat already been killed");
//			return;
//		} 

		//내가 공격한 Rat의 체력을 2 깎는다.
//		rat.setHp(rat.getHp()-2);
//		
//		if(rat.getHp()<=0) {
//			System.out.println("You've killed the rat");
//			this.exp += 10;
//			this.hp -=1;
//			
//		} else {
//			System.out.println("you've hunted rat. 1 hp decreased");
//			this.hp-=rat.getAtk();
//		}
		
		if(!rat.isRatActive()) {
			System.out.println("Rat already been killed");
			return;
		}
		
		//내가 공격한 Rat의 체력을 2 깎는다.
		rat.setHp(rat.getHp()-2);
		
		if(rat.isAttackedRatActive(atk)) {
			System.out.println("you've hunted rat. 1 hp decreased");
			this.hp-=rat.getAtk();
			rat.setHp(rat.getHp()-atk);
		} else {
			System.out.println("You've killed the rat");
			this.exp += 10;
			this.hp -=1;
			rat.setHp(rat.getHp()-atk);
		}
	}
	
	
	//Pig
	

}
