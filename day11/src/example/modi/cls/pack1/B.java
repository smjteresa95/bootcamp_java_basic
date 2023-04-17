package example.modi.cls.pack1;
//import example.modi.cls.pack1.A;

//public 접근제한자는 어디서나 접근가능
public class B {
	/*
	 * 클래스 A의 접근제한자가 default 이기 때문에 
	 * 같은 패키지 내부인 B에서 A를 선언 할 수 있다.
	 */
	A a1 = new A(false); //public
	A a2 = new A(55); //default
	A a3 = new A("안됨"); //private은 A 내부에서만 호출 할 수 있다.
	
	//클래스 B는 public class이므로 패키지가 달라도 생성가능하다.
	//패키지가 다를 경우, 무조건 생성하려는 객제의 클래스를 import해야한다.
	
	B b = new B();
	
	//클래스 A는  default접근제한자를 붙였기 때문에 class A를 import 했더라도 객체 생성 할 수없다. 
	//A a = new A();
		
	
}
