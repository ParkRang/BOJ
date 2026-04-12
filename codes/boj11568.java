package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num[] = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i<=N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int dp[] = new int[N+1];
		for(int i = 1; i<=N; i++) {
			dp[i] = 1;
			for(int j = 0; j<i; j++) {
				if(num[i]>num[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			
		}
		int K = 0;
		for(int i = 0; i<=N; i++) {
			K = Math.max(K, dp[i]);
		}
		
		System.out.println(K);
	}
}
