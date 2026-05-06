package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5217 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<N; i++) {
			int K = Integer.parseInt(br.readLine());
			sb.append("Pairs for ").append(K).append(": ");
			boolean isSeq = false;
			for(int j = 1; j<K; j++) {
				if(j < K-j ) {
					if(isSeq) sb.append(", ");
					isSeq = true;
					sb.append(j).append(" ").append(K-j);
				}
			}
			
			
			sb.append("\n");
		}
		System.out.print(sb);
		
	}
}
