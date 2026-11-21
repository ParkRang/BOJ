package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10174 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<N; i++) {
			String s = br.readLine().toLowerCase();
			boolean isTrue = true;
			for(int j = 0; j<s.length()/2; j++) {
				if(s.charAt(j)!=s.charAt(s.length()-j-1))
					isTrue = false;
			}
			sb.append(isTrue?"Yes":"No").append("\n");
		}
		System.out.println(sb);
	}
}
