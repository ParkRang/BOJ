package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2195 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int N1 = s1.length();
		int N2 = s2.length();
		
		int idx = 0;
		int cnt = 0;
		while(idx<N2) {
			for(int i = N2-idx; i>=1; i--) {
				if(s1.contains(s2.substring(idx, i+idx))) {
					idx = idx + i;
					cnt++;
					break;
				}
			}
			
		}
		System.out.println(cnt);
	}
}
