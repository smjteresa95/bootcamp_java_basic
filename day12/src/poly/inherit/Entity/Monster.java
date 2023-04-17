package poly.inherit.Entity;

//모든 몬스터 클래스의 부모로 설계
public class Monster {
	
	private String name;
	private int ph;  //체력
	private int atk; //공격력
	private int def; //방어력
	private int exp; //경험치
	
	//부모 쪽 생성자로 초기화 할 때 어떤 몬스터가 생성될 지 모르므로
	//고정값이 아닌 입력자료를 받아 처리해야 한다.
	public Monster(String name, int ph, int atk, int def, int exp) {
		this.name = name;
		this.ph=ph;
		this.atk=atk;
		this.def=def;
		this.exp=exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPh() {
		return ph;
	}

	public void setPh(int ph) {
		this.ph = ph;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public boolean isMonsterActive() {
		return this.ph>0 ? true : false;
	}
	
	//몬스터가 공격을 당한경우
	public void monsterGotAttacked(int playerAtk) {
		this.ph-=playerAtk;
		System.out.println();
	}
	
	

}
