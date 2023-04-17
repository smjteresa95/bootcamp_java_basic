package example.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GFG {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.reverseOrder();
		//Using sort() method of Collections class to
		//sort the elements and passing list and using 
		//reverseOrder() method to sort in descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
