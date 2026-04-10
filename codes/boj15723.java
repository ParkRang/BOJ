package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15723 {
	static int N, K;
	static int parent[];
	static boolean isTrue;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		parent = new int[27];

		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<N; i++) {

			String s = br.readLine();
			char A = s.charAt(0);
			char B = s.charAt(5);
			parent[A-'a'+1] = B-'a'+1;
		}
		
		K = Integer.parseInt(br.readLine());
		for(int i = 0; i<K; i++) {
			String s = br.readLine();
			char A = s.charAt(0);
			char B = s.charAt(5);
			isTrue = false;
			int Q = A-'a'+1;
			int W = B-'a'+1;
			dfs(Q, W);
			
			sb.append(isTrue?"T":"F").append("\n");
			
		}
		System.out.print(sb);
	}
	
	static void dfs(int S, int E) {
		if(S == E) {
			isTrue = true;
			return;
		}
		if(S == 0) {
			return;
		}
		dfs(parent[S], E);
	}
}
