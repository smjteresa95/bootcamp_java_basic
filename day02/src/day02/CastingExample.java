package day02;

public class CastingExample {

	public static void main(String[] args) {
		
		promotion(); //자동형변환
		casting(); //강제형변환

	}
	
	public static void promotion() {
		/*
		 * 자동형변환
		 * 크기가 작은 데이터 타입의 테이터를 큰 데이터타입으로 변환할때는 
		 * 데이터 타입을 자동으로 올려서(Promotion/upcasting)처리합니다
		 */
		byte b = 10;
		int i = b; //byte -> int로 자동변환
		System.out.println(i);
		
		char c ='가';
		int j = c; //char -> int로 자동변환
		System.out.println(j);
		
		int k =500;
		double d = k; //int -> double로 자동변환
		System.out.println(d);
	}
	
	public static void casting() {
		/*
		 *강제형변환
		 *크기가 큰 데이터를 작은 데이터 타입으로 바꾸려면 
		 *반드시 캐스팅 연산자(type)을 사용하여
		 *명시적으로 형변환을 해야합니다. 
		*/
		
		int i = 72;
		char c = (char) i; //int -> char은 자동변환이 되지 않으므로 char로 바꾼다고 명시해야한다. 
		System.out.println(c);
		
		/*
		 * 강제형변환이 일어날 경우 데이터 손실이 일어날 가능성이 있기 때문에 
		 * 자동으로 처리해주지 않습니다. 
		 */
		double d = 4.83123;
		int j = (int) d; // 변환시 소수점 아래가 소실되므로 자동변환을 하지 않는다.
		System.out.println(j);
		/*
		 * 강제형 변환시 주의점은 해당 데이터 타입이 
		 * 처리 할 수 있는 범위를 넘어선 데이터를 강제로 다운캐스팅 하면
		 * 오버플로우가 일어납니다.
		 */
		
		//00000000 00000000 00000100 00000000(2) = 1024(10)
		int k = 1024;
		//바이트로 업캐스팅 했을 때 맨 오른쪽 8비트를 제외하고 나머지는 삭제. 
		byte b = (byte) k; // -128~+127 범위에 1024 넣기. 
		System.out.println(b); // 0
		
	}

}
