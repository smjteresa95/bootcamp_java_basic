package exception.multi;

import java.util.Scanner;

/*
 * 요즘에 많이 하는 방식은 
 * Exception 하나로 뭉뚱그려서 예외처리하는 것이 아니라 
 * 상세하게 하나씩 지정해 주고 마지막에 Exception으로 잡아주는 식으로 코드를 짠다.
 * 
 */
public class MultiCatchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(new StringBuffer("1st data: "));
			String data1 = sc.next();
			System.out.println(new StringBuffer("2nd data: "));
			String data2 = sc.next();
			
			//NumberFormatException 발생가능
			int i = Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			//Aritmeticexception 발생가능
			int result = i/j;
			System.out.println(new StringBuffer()
										.append(i)
										.append("/")
										.append(j)
										.append("=")
										.append(result));
			//NullPointerException 발생가능
			String str = null;
			str.charAt(0);
			
			//Exception은 |(or) 밖에 못한다. 
		}catch(NumberFormatException | NullPointerException e) {
			System.err.println(new StringBuffer("input number only"));
		}catch(ArithmeticException e) {
			System.err.println(new StringBuffer("can not div to 0"));
		}catch(Exception e) {
			System.err.println(new StringBuffer("Unknown error occured"));
			System.err.println(new StringBuffer("restoring.."));
		}finally {
			sc.close();
		}
			
		}

}
