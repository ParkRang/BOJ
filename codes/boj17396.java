package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj17396 {
	static int N, M;
	static long INF;
	static int sight[];
	static long dist[];
	static ArrayList<Node>[] graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		sight = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++)
			sight[i] = Integer.parseInt(st.nextToken());
		sight[N-1] = 0;
		
		INF = Long.MAX_VALUE;
		
		graph = new ArrayList[N];
		for(int i = 0; i<N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long t = Long.parseLong(st.nextToken());
			if(sight[a]==0 && sight[b]==0) {
				graph[a].add(new Node(b, t));
				graph[b].add(new Node(a, t));
			}
		}
		
		dijkstra(0);
		
		System.out.println(dist[N-1]==INF?-1:dist[N-1]);
	}
	static void dijkstra(int start) {
		dist = new long[N];
		Arrays.fill(dist, INF);
		dist[0] = 0;
		boolean visited[] = new boolean[N];
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0, 0));
		
		while(!pq.isEmpty()) {
			int now = pq.poll().to;
			
			if(visited[now]) continue;
			visited[now] = true;
			
			for(Node next : graph[now]) {
				if(dist[next.to] > dist[now]+next.weight) {
					dist[next.to] = dist[now]+next.weight;
					
					pq.offer(new Node(next.to, dist[next.to]));
				} 
			}
		}
		
		
	}
	
	static class Node implements Comparable<Node>{
		int to;
		long weight;
		
		public Node(int to, long weight) {
			this.to = to;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node o) {
			return Long.compare(this.weight, o.weight);
		}
	}
}
