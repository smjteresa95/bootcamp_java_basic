package hetero;
/*
 * 이종모음(
 * 배열에 다형성을 적용시키는 원리이다. 
 * 이걸 이용해서 부모클래스에서 객체들의 배열을 선언해서 자식클래스를 배열로 묶을 수 있다. 
 * Monster 라는 부모객체가 있을 때, [Rabbit, Rat, Wolf] 자식클래스로 이루어진 배열을 형성 할 수 있다는 것이다. 
 */
public class MainClass {
	
	public static void main(String[] args) {
		//기본형 자료형으로 만든 배열예시
		//다른 자료형을 넣을 수 없음.
		
		//int[] iarr = {1,2,3,4,5,6,7,8,"가나다"};
		
		//A자료형의 힙 주소를 배열로 저장 가능함. 
		//일단 인스턴스는 주소로 보기. 
		//*클래스도 자료형이다
		A[] aAry = new A[2];
		A a1 = new A();
		A a2 = new A();
		
		aAry[0] = a1;
		aAry[1] = a2;
		
		//Object는 모든 자료형 클래스의 부모 클래스다.
		Object[] oAry = new Object[3];
		
		B b1 = new B();
//		aAry[1] = b1; //A타입 배열에 B타입 대입불가
		oAry[0] = b1;
		oAry[1] = a2;	
		
		oAry[1] = 10; //Object에는 기본형 자료도 대입가능
		oAry[2] = "string";
	
    }

}
