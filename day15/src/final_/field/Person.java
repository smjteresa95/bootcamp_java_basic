package final_.field;

public class Person {
	
	/*
	 * final변수는 단 한번 초기화 될 수 있고,
	 * 이후에는 변경이 불가능 하기 때문에 선언시에 
	 * 1. 직접 초기화를 해주거나 
	 * 2. 생성자에서 초기화를 해주어야 한다.
	 */
	
	//선언부 직접 초기화
	public final String nationality ="South korea";
	
	//필드 쪽에서 초기화 안하면 무조건 생성자 초기화는 해줘야 한다.
	public final String name;
	
	//final이 안붙은 멤버변수는 초기화 의무X
	public int age;
	
	public Person(String name) {
		this.name=name;
	}
	
}
