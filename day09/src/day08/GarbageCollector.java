package day08;

public class GarbageCollector {
	
	public int objectNum; // 객체번호
	
	// 생성자(객체가 힙에서 생성되기 직전에 메서드)
	public GarbageCollector(int number) {
		objectNum = number;
		System.out.println("no. "+ objectNum + "instance created");
	}
	
	//소멸자(객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	//@Override가 자동적으로 되긴하는데 finaliz 라고 오타를 내서 적으면 에러가 뜬다. 
	//유지보수측면에서 오타가 있는 지 없는지 식별 할 수 있기 때문에 @Override를 쓰는 것이 좋다.
	@Override
	protected void finalize() throws Throwable{
		System.out.println("no. " + objectNum + "instance deleted from heap.");
	}
}
