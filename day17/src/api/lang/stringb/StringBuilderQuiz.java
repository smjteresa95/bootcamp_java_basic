package api.lang.stringb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 사용자로부터 문장을 읽고 
 * 문장의 단어 순서를 바꾼 다음 반전된 문장을 
 * 다시 사용자에게 출력하는 프로그램을 작성하자.
 */

public class StringBuilderQuiz {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence: ");
        String sentence = reader.readLine();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(sentence);
        while (st.hasMoreTokens()) {
            sb.insert(0, st.nextToken() + " ");
        }
        sb.reverse();
        System.out.println("Reversed sentence: " + sb.toString());
    
		
	}

}
