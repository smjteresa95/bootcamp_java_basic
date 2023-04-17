package static_method;

public class AseanMain {
	
	public static void main(String[] args) {
		
		//인스턴스 생성 전부터 이미 조회 가능한 팀 점수
		System.out.println(Asean.presentationScore);
		
		//학생 4명 만들기
		Asean a1 = new Asean("Minjee", 20, 45);
		Asean a2 = new Asean("Minjung", 20, 38);
		Asean a3 = new Asean("HyunJeong", 18, 40);
		Asean a4 = new Asean("Dodam", 20, 10);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
		
	}

}
