package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj25516 {
	static int N, K, cnt;
	static int apple[];
	static ArrayList<Integer>[] AL;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		AL = new ArrayList[N];
		for(int i = 0; i<N; i++) {
			AL[i] = new ArrayList<>();
		}
		for(int i = 1; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			AL[A].add(B);
		}
		st = new StringTokenizer(br.readLine());
		apple = new int[N];
		for(int i = 0; i<N; i++) {
			apple[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0, 0);
		System.out.println(cnt);
	
	}
	
	static void dfs(int node, int depth) {
		if(depth>K)
			return;
		cnt = cnt + apple[node];

		for(int i = 0; i<AL[node].size(); i++) {
			dfs(AL[node].get(i), depth+1);
		}
	}
}
