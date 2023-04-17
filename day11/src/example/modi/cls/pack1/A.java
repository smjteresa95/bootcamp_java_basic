package example.modi.cls.pack1;

/*
 * default(package friendly)제한자는 접근제한자를 생략하면 
 * 자동으로 간주된다. 같은 패키지 내부자료들끼리만 접근 가능하다. 
 */
public class A {
	
	//생성자를 외부에서 선언
	public A(boolean b) {
		// TODO Auto-generated constructor stub
	}
	
	A(int x) {
		// TODO Auto-generated constructor stub
	}
	
	private A(String a) {
		
	}
	
//멤버변수 선언
	A a1 = new A(true);
	A a2 = new A(3);
	A a3 = new A("hi");
	

	
	

	
	
	

}
