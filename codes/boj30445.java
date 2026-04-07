package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj30445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int h = 0;
		int g = 0;
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='H'||c=='A'||c=='P'||c=='Y') {
				h++;
			}
			if(c=='S'||c=='A'||c=='D') {
				g++;
			}
			
		}
		double A = 0;
		if(g==0&&h==0) {
			A = 50;
			
		} else 
			A = (double)h/(double)(h+g) * 100;
		System.out.println(String.format("%.2f", A));
	}
}
