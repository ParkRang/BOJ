package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10409 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for(int i = 0; i<N; i++) {
			int A = Integer.parseInt(st.nextToken());
			T = T - A;
			if(T >= 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
