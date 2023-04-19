package api.lang.string_class;

import java.util.Scanner;

public class StringIndexOfQuiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String a = "can";
		
		int idx = 0;
		int cnt = 0;
		
		for(int i=0;i<str.length();) {
			idx = str.indexOf(a, i);
			if(idx>0) {
				System.out.println(idx);
				i=idx+a.length();
				cnt++;
			}else if (idx<0)
				System.out.println(new StringBuffer("end"));
				break;
		}	
		
		System.out.println(new StringBuffer("Total number of ")
				.append(a)
				.append(": ")
				.append(cnt));
		
		sc.close();
	}
	
	

	public static void findIndex(String str, String a) {
		
		int lastIdx = 0;
		int cnt = 0;
		int result = 0;
		boolean flag = true; //반복조회실행여부
		
		System.out.println(a + " 의 인덱스 위치:");
		
		while(flag) {
			result = str.indexOf(a, lastIdx);
			if(result == -1) {
				System.out.println("단어 찾기 끝");
				flag = false;
			}
			else{
				System.out.println(result);
				lastIdx = result+ a.length();
				cnt++;
			}
		}	
		System.out.println("단어 갯수: "+ cnt);
		
	}

}
