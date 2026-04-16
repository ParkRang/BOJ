package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String s = br.readLine();
		String M = br.readLine();
		
		if(s.equals("*")) {
			N = N + M.substring(1);
		} else {
			if(N.length()==M.length()) {
				N = "2" + M.substring(1);
			} else if(N.length()>M.length()) {
				N = N.substring(0, N.length()-M.length()) + M;
			} else {
				N = M.substring(0, M.length()-N.length()) + N;
			}
		}
		
		System.out.println(N);
	}
}
