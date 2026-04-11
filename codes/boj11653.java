package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int K = 2;
		while(N>1) {
			if(N % K == 0) {
				N = N / K;
				sb.append(K).append("\n");
			} else {
				K++;
			}
			
		}
		System.out.print(sb);
		
	}
}
