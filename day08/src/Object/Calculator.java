package Object;

public class Calculator {
	
	public Calculator() {
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int substract(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(1, 3));
		System.out.println(cal.substract(2, 5));
		
	}
}
