package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj24510 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int max = 0;
		
		for(int i = 0; i<N; i++) {
			String s = br.readLine();
			s = s.replace("for", "1");
			s = s.replace("while", "1");
		
			int cnt = 0;
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(j)=='1') {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
		
	}
}
