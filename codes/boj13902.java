package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj13902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int num[] = new int[K+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i<=K; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[N+1];
		
		Arrays.fill(dp, 999999);
		dp[0] = 0;
		for(int i = 1;i<=N; i++) {
			for(int j = 0; j<=K; j++) {
				if(i>=num[j]) {
					dp[i] = Math.min(dp[i], dp[i-num[j]]+1);
				}
			}
		}
		
		for(int i = 0; i<=N; i++) {
			System.out.print(dp[i] + " ");	
		}
	}
}
