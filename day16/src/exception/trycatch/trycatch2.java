package exception.trycatch;

public class trycatch2 {
	public static void main(String[] args) {
		String[] greetings = {"Hi", "Hola", "Nihao", "Annyeong"};
		
		int i = 0;
		while(i<5) {
			try {
				System.out.println(greetings[1]);
				
			} catch(Exception e) {
				//배열의 참조범위를 벗어남
				System.err.println("Index out of bound blah");
			} finally {
				//없어도 되지만 로직이 블럭과 관련 있을 때 사용
				System.out.println("no need but used when logic is related to try-catch block.");
			}
			i++;
			
		}
		System.out.println("program terminating");
	}

}
