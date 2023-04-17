package final_.method;

public class Child extends Parent{
	
	@Override
	public void method1() {
		//자식 쪽 Override 허용
	}
	
	@Override
	public void method2() {
		//final 붙은 method는 재정의 불가
		//Cannot override the final method from Parent -
		//overrides final_.method.Parent.method2
	}

}
