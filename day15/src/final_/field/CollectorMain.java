package final_.field;

import java.util.Arrays;

public class CollectorMain {
	public static void main(String[] args) {
		Collector c1 = new Collector();
		
		System.out.println(Arrays.toString(c1.stickers));
		
		//stickers 배열이 final로 선언이 되었는데 변경이 됐다.
		
		c1.stickers[0] = "파이리";
		
		System.out.println(Arrays.toString(c1.stickers));
	}
}
