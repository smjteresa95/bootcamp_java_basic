package casting;

public class Child extends Parent {
	
	@Override
	public void method2() {
		System.out.println("2nd method overrode from Child");
	}
	
	public void method3() {
		System.out.println("the only method Child have");
	}

}
