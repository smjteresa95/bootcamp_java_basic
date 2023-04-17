package example.modi.protec.pac1;

public class A {
	
	/*
	 * protected는 다른 패키지일지라도 양 클래스가 부모자식 관계라면 제한적으로 접근을 허용해준다.
	 * 부모자식간 클래스를 서로 다른 패키지를 넣어놓는 경우는 극히 드물다.
	 * 
	 *같은 패키지이기만하면 접근이 가능하다.
	 */
	protected String a;
	private int b;
	
	public A(String a) {
		this.a =a;
	}
	
	public A(int b) {
		this.b=b;
		
	}
}
