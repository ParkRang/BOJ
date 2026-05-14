package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1753 {
	static int V, E, INF;
	static ArrayList<Node> graph[];
	static int dist[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(br.readLine());
	
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[V+1];
		for(int i = 0; i<=V; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for(int i = 0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			graph[u].add(new Node(v, w));
		}
		INF = Integer.MAX_VALUE;
		
		dist = new int[V+1];
		Arrays.fill(dist, INF);
		dist[K] = 0;
		dijkstra(K);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<=V; i++) {
			if(dist[i]==INF)
				sb.append("INF");
			else
				sb.append(dist[i]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static void dijkstra(int start) {
		boolean[] visited = new boolean[V+1];
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		while(!pq.isEmpty()) {
			int now = pq.poll().to;
			if(visited[now]) continue;
			visited[now] = true;
			
			for(Node next : graph[now]) {
				if(dist[next.to]>dist[now]+next.weight) {
					dist[next.to] = dist[now]+next.weight;
				
					pq.offer(new Node(next.to, dist[next.to]));
				}
			}
			
		}
		
		
	}
	
	static class Node implements Comparable<Node>{
		int to, weight;
		
		public Node(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
	}
}
