package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1446 {
	static int N, D;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		List<List<b1446>> graph = new ArrayList<>();
		for(int i = 0; i<=D; i++) 
			graph.add(new ArrayList<>());
		
		for(int i = 0; i<D; i++)
			graph.get(i).add(new b1446(0, i+1, 1));
		

		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			if(to > D || to - from <= weight) continue;
			
			graph.get(from).add(new b1446(from, to, weight));
		}
		

		int[] dist = new int[D+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0] = 0;
		
		PriorityQueue<b1446> pq = new PriorityQueue<>();
		pq.add(new b1446(0, 0, 0));
		
		while(!pq.isEmpty()) {
			b1446 now = pq.poll();
			
			if(dist[now.to] < now.weight) continue;
			
			for(b1446 next : graph.get(now.to)) {
				int newCost = dist[now.to] + next.weight;
				if(newCost < dist[next.to]) {
					dist[next.to] = newCost;
					pq.add(new b1446(now.to, next.to, newCost));
				}
			}
		}
		System.out.println(dist[D]);
		
	}
	
	static class b1446 implements Comparable<b1446>{
		
		int from;
		int to;
		int weight;
		
		b1446(int from, int to, int weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(b1446 o) {
			return this.weight - o.weight;
		}
	}
}
