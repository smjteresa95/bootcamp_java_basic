package example.modi.member.pac1;

public class B {
	
	//생성자 내부에 코드작성
	public B() {
		A a = new A();
		a.a = 1;  //public 접근 가능
		a.b = 2;  //default 접근 가능
		a.c = 3;  //private 접근 불가
		
		a.method1();
		a.method2();
		a.method3();
	}
	
	

}
