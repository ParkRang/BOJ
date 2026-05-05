package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1285 {
	static int N;
	static boolean[][] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new boolean[N][N];
		
		for(int i = 0; i<N; i++) {
			String s = br.readLine();
			for(int j = 0; j<N; j++) {
				if(s.charAt(j) == 'T') {
					map[i][j] = true;
				} 
			}
		}
		
		int ans = 999_999_999;
		
		for(int bit = 1; bit<(1<<N); bit++) {
			int sum = 0;
			for(int j = 0; j<N; j++) {
				int tail = 0;
				
				for(int i = 0; i<N; i++) {
					boolean p = map[i][j];
					if((bit & (1<<i)) != 0) {
						p = !p;
					}
					if(p)
						tail++;
				}
				sum = sum + Math.min(tail, N-tail);
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
