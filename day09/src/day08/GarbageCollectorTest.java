package day08;

public class GarbageCollectorTest {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			GarbageCollector test = new GarbageCollector(i);
			
			//스택과 힙의 연결을 끊는다. 
			test=null;
			
			//쓰레기 수집 강제 실행 명령어(쓸 필요는 없다.)
			//스택과 힙의 연결이 끊어진 인스턴스를 garbage라고 한다. 
			//연결이 되어있는 상태에서는 
			System.gc();
		}
	}
}
