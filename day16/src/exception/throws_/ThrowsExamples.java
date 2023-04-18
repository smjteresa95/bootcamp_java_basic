package exception.throws_;

public class ThrowsExamples {
	public void aaa(int n) throws Exception{
		System.out.println("aaa 호출");
		int i=10/n;
		System.out.println("계산결과: "+i);
		System.out.println("aaa실행 종료");
	}
	
	public void bbb() throws Exception{
		System.out.println("bbb호출");
		aaa(0);
		System.out.println("bbb실행종료");
	}
	
	public void ccc() throws Exception{
		System.out.println("생성자 호출");
		ccc();
		System.out.println("생성자 실행 종료");
	}
	public static void main(String[] args) {
		try {
			ThrowsExamples te = new ThrowsExamples();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("code return end for real");
	}

}
