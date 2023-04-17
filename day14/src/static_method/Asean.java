package static_method;

public class Asean {
	//조별과제
	//출력 20 + 발표 30 + 기말 50
	
	//개인점수
	private String name;
	private int attendanceScore;
	private int finalTermScore;
	
	public static int presentationScore;
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name=name;
		this.attendanceScore=attendanceScore;
		this.finalTermScore=finalTermScore;
	}
	
	//static 블록 내부코드는 프로그램 시작 즉시 자동으로 한번 호출된다. 
	static {
		presentationScore = 29;
	}
	
	public void showStudentScore() {
		System.out.println("student name: " +this.name);
		System.out.println("attendance score: "+this.attendanceScore);
		System.out.println("team score: " + presentationScore);
		System.out.println("final exam score: "+ this.finalTermScore);
		System.out.println("FINAL SCORE: "  +(this.attendanceScore 
											+ presentationScore 
											+ this.attendanceScore));
		System.out.println("-------------------------");
	}
	
	
	
	

}
