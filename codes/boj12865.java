package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj12865 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int weight[] = new int[N+1];
		int value[] = new int[N+1];
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
		}
		int[][] dp = new int[N+1][K+1];

		dp[0][0] = 0;
		for(int i = 1; i<=N; i++) {
			dp[i][0] = 0;
			for(int j = 0; j<=K; j++) {
				dp[i][j] = dp[i-1][j];
				if(j>=weight[i]) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-weight[i]]+value[i]);
				}
			}
		}
		int v = 0;
		for(int i = 1; i<=N; i++) {
			v = Math.max(dp[i][K], v);
		}
		System.out.println(v);
		
		for(int i = 0; i<=N; i++) {
			for(int j = 0; j<=K; j++) {
				System.out.print(dp[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
