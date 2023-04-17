package this_human;

public class Human {
	
	public String name;
	public int age;
	
	//생성자 선언
	public Human() {
		this("no name", -2);
	}
	
	public Human(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Human(String name) {
		this(name, -1); //아래 주석처리 된 코드로 대체 가능하다.
		//this.name=name;
		//this.age=-1;
	}
	
	public void showInfo() {
		System.out.printf("name: %s, age: %d\n", name, age);
	}
	
	
}
