package example.overload;

public class OverloadExample {
	
	public void input(int a) {
		System.out.println("input 1 integer number");
	}
	
	public void input(int a, int b) {
		System.out.println("input 2 integer numbers");
	}
	
	public void input(String a) {
		System.out.println("input 1 string");
	}
	
	public void input(String a, double b) {
		System.out.println("input 1 string, 1 float num");
	}
	
	public void input(double a, String b) {
		System.out.println("input 1 float num, 1 string ");
	}
	
	//타입과 갯수가 겹치면 안됨.
//	public void input(int i) {
//		System.out.println("what if name and type are same?");
//	}

}
