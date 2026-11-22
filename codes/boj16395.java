package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj16395 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long[][] num = new long[N+1][N+3];
		
		num[0][1] = 1;
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=i; j++) {
				num[i][j] = num[i-1][j-1] + num[i-1][j];
			}
		}
		
		System.out.println(num[N][K]);
		
	}
}
