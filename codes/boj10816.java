package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			int A = Integer.parseInt(st.nextToken());
			map.put(A, map.getOrDefault(A, 0)+1);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++) {
			int A = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(A, 0)).append(" ");
		}
		System.out.print(sb);
	}
}
