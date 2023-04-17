package example.super_;

public class SupersonicPlane extends Airplane{
	
	//상속받는 멤버변수 없음
	
	public SupersonicPlane(String planeCode){
		super(planeCode);// 현 구조에서는 airplane 생성자 호출.

	}
	
	//SupersonicPlane에서도 fly()를 사용해야하므로 오버라이딩합니다.
	//시속 900km이하에서는 일반 비행을, 그 이후에는 초음속 비행을 하므로 
	//시속 900 km 이하에서는 override 전 fly(), 이상에서는 override 한 fly()를 실행.
	
	@Override
	public void fly() {
		if(speed<900) {
			super.fly();
		} else if(this.speed+300>2200 && this.gas>=5) {
			this.speed += 300;
			this.gas -=5;
		} else {
			System.out.println("no fuel");
		}
	}

}
