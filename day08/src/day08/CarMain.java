package day08;

public class CarMain {

	public static void main(String[] args) {
		//자동차를 한대 생성
		// 값은 연료 100, 속도 0, 나머지는 알아서 초기화
		// 엑셀 3번 밟고, 계기판 조회, 브레이크 2번, 계기판 조회
		
		int numOfGasPadalStep = 3;
		int numOfBreakStep = 2;
		
		//String carModel, int velocity, int maxPassengerNum, String carOwner)
		Car car1 = new Car("Honda Accord", 0, 5, "Bori");
		
		while(numOfGasPadalStep>0) {
			car1.accelerate();
			numOfGasPadalStep--;
		}
		
		car1.showStatus();
		
		while(numOfBreakStep>0) {
			car1.breakSpeed();
			numOfBreakStep--;
			
		}
		
		car1.showStatus();
		
	}
}
