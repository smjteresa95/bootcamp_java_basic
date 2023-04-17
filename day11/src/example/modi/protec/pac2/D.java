package example.modi.protec.pac2;

import example.modi.protec.pac1.A;

public class D extends A{

	public D(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	/*
	 * protected는 패키지가 다를 경우, 
	 * 두 클래스 사이의 상속관계가 있다면
	 * super 키워드를 이용해 부모쪽 참조를 허용한다.
	 * 
	 * super()생성자는 무조건 첫줄에 위치해야한다. 
	 * 
	 */
}
