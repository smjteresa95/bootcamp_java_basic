package api.util;

import java.util.Arrays;

public class ArraysSearch {
	
	public static void main(String[] args) {
		int[] scores = {75, 47, 23, 56, 89};
		int[] scores2 = Arrays.copyOf(scores, 3);
		
		//Arrays.sort(): 배열의 데이터를 오름차순으로 정렬하는 메서드
		Arrays.sort(scores2);
		
		System.out.println("scores: "+Arrays.toString(scores));
		System.out.println("scores2: "+Arrays.toString(scores2));
		
		
		/*
		 * 이진탐색 빠르다. 데이터가 많을수록 효율이 좋다.
		 * 사용하려면 정렬(오름차순/내림차순)이 되어있어야 이진탐색을 사용할 수 있다
		 * 가운데에 있는 인덱스부터 찾는다. 
		 * 
		 */
		
		//Arrays.binarySearch(): 배열내부 인덱스번호를 탐색하는 메서드
		int index = Arrays.binarySearch(scores,75);
		System.out.println("75가 저장된 index number: "+index);
		
		//Arrays.equals(array1, array2): 배열 내부 요소비교
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {1,3,5,7,9};
		
		String result = Arrays.equals(arr1, arr2)? "Array match" : "Array unmatch";
		System.out.println(result);
	}

}
