package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14595 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		int num[] = new int[N+1];
		
		for(int i = 0; i<K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
		
			num[s]++;
			num[e]--;
		}
		
		for(int i = 1; i<=N; i++) {
			num[i] = num[i] + num[i-1];
		}
		int cnt= 1;
		for(int i = 1; i<N; i++) {
			if(num[i]==0)
				cnt++;
		}
		System.out.println(cnt);
		
	}
}
