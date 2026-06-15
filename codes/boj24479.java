package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class boj24479 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		List<Integer> AL[] = new ArrayList[N+1];
		for(int i = 0; i<=N; i++) {
			AL[i] = new ArrayList<>();
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			AL[u].add(v);
			AL[v].add(u);
		}
		
		for(int i = 0; i<=N; i++) {
			Collections.sort(AL[i], Collections.reverseOrder());
		}
		
		boolean visited[] = new boolean[N+1];
		int[] seq = new int[N+1];
		int cnt = 1;
		
		Deque<Integer> q = new ArrayDeque<>();
		q.add(R);
		visited[R] = true;

		while(!q.isEmpty()) {
			int A = q.pollFirst();
			seq[A] = cnt++;
			
			for(int i = 0; i<AL[A].size(); i++) {
				int t = AL[A].get(i);
				if(!visited[t]) {
//					q.remove((Object) t);
					q.addFirst(t);
					visited[t] = true;
				}
			}
		}
		for(int i = 1; i<=N; i++) {
			sb.append(seq[i]).append("\n");
		}
		System.out.print(sb);
		
	}
}
