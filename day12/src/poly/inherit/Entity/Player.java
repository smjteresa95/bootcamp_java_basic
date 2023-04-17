package poly.inherit.Entity;

public class Player {
	
	private String userType;
	private int ph;
	private int atk;
	private int def;
	private int exp;
	
	public Player(String userType, int ph, int atk, int def, int exp) {
		this.userType = userType;
		this.ph = ph;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}
	
	public void showStatus() {
		System.out.printf("[%d] physical: %d, defense: %d, experience %d\n", userType, ph, atk, def, exp);
		System.out.println("-----------------------------------------------------------");
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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
	
	



}
