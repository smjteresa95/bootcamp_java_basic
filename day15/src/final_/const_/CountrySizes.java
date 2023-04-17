package final_.const_;

//상수를 선언 할 때는 상수 집합을 만드는 목적으로 아래와 같이 클래스를 선언한다.
public class CountrySizes {
	//상수는 보통 public 으로 풀고 사용한다.(값 변경이 불가능하고 공용성을 띄므로)
	
	//static으로 선언해서 instance를 만들지 않아도 사용할 수 있다.
	//final 이기 때문에 값 변경이 불가능하다.
	//공개가 되도 무관한 값이기 때문에 public 으로 선언. 
	public final static int KOREA_SIZE = 100431;
	public final static int US_SIZE = 9833519;
	public final static int THAI_SIZE = 513325;

}
