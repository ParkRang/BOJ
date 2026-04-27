package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1434 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int N1 = 0;
		int M1 = 0;
		for(int i = 0; i<N; i++) {
			N1 = Integer.parseInt(st.nextToken()) + N1;
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++) {
			M1 = Integer.parseInt(st.nextToken()) + M1;
		}
		
		System.out.println(N1-M1);
	}
}
