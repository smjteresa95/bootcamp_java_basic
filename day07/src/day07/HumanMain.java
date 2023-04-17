package day07;

public class HumanMain {

	public static void main(String[] args) {
		//타 클래스에 정의된 요소를 main 내부에서 생성해 쓸 수 있습니다.
		
		//new 키워드는 힙에 자료를 저장 합니다.
		//자료형 변수이름 = new 자료형();
		//위 명령어로 구조체의 인스턴스를 생성 할 수 있습니다.
		//new 키워드의 리턴자료는 해당 힙의 주소.
		
		//사람 1 생성
		Human h1 = new Human();
		h1.name ="송민지";
		h1.age = 29;
		h1.height =163;
		
		System.out.println(h1.name);
		System.out.printf("사람 1의 키 %d\n", h1.height);
		
		//사람 2 생성
		Human h2 = new Human();
		h2.name = "유재석";
		h2.age = 20;
		h2.height = 180;
		
		System.out.printf("사람 2의 키 %d\n", h2.height);

	}

}
