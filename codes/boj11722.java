package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11722 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[N+1];
		int dp[] = new int[N+1];
		
		for(int i = 1; i<=N; i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		
		for(int i = 1; i<=N; i++) {
			dp[i] = 1;
			for(int j = 1; j<=i; j++) {
				if(num[j]>num[i]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max = 0;
		for(int e : dp) 
			max = Math.max(e, max);
		
		System.out.println(max);
		
	}
}
