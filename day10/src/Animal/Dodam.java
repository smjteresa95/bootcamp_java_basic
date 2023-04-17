package Animal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dodam {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int a = Integer.parseInt(br.readLine());
		
		String[] ary = new String[a];
		int[] intAry = new int[a];
		
		for (int i=0; i<a; i++) {
			ary[i] = br.readLine();
			intAry[i] = Integer.parseInt(br.readLine());
		}
	
		bw.newLine();
		bw.write(Arrays.toString(ary));
		bw.write(Arrays.toString(intAry));
		
		bw.flush();
		bw.close();
	}

}
