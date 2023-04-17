package day08;

//BasketBallPlayer.java

public class BasketBallPlayer {
	//member variable 
	public String name;
	public int height;
	public int age;
	public String salary;
	
	//Constructor
	BasketBallPlayer(String playerName, int playerHeight, int playerAge, String playerSalary){
		name=playerName;
		height=playerHeight;
		age=playerAge;
		salary=playerSalary;
	}
	public void showInfo() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(salary);
	}
	
	public void dunkShoot() {
		if(height>190) {
			System.out.println("dunkshoot success");
		} else 
			System.out.println("can't reach");
	}
}
