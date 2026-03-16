package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3584 {
	static int N;
	static int parent[];
	static int count[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc<T; tc++) {
			N = Integer.parseInt(br.readLine());
			parent = new int[N+1];
			count = new int[N+1];
			for(int i = 0; i<N-1; i++) {
				st= new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				parent[B] = A;
			}
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			find(A);
			find(B);
		}
		System.out.print(sb);
	}
	
	static void find(int A) {
		count[A]++;
		if(count[A]>=2) {
			sb.append(A).append("\n");
			return;
		}
		
		if(parent[A]==0) {
			return;
		}
		
		find(parent[A]);
	}

}
