package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj34705 {
	static int[] arr;
	static int X, Y;
	static boolean isTrue;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int tc = 0; tc<T; tc++) {
			st = new StringTokenizer(br.readLine());
			isTrue = false;
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			arr = new int[5];
			for(int i = 0; i<5; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0, 0);
			sb.append(isTrue?"YES":"NO").append("\n");
		}
		System.out.print(sb);
		
	}
	
	static void dfs(int depth, int p) {
		if(depth==5) {
			if(p >= X && p <= Y) {
				isTrue = true;
			}
			return;
		}
		dfs(depth+1, p + arr[depth]);
		dfs(depth+1, p);
	}
}
