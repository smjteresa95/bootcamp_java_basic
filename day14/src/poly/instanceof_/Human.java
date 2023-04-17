package poly.instanceof_;

public class Human {
	
	private String name;
	private int age;
	
	//생성자를 만들어주세요
	//name age를 파라미터로 전달받아 초기화해주세요
	
	public Human(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Human() {
		this("name",0);
	}
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	
	//만약 void 파라미터로 생성자 호출시 
	//"noname", 0을 이름ㅁ과 나이로 초기화 하는 생성자도 만들기
	//showInf()만들어 주세요. 이름과 나이를 콘솔에 찍어준다.

}
