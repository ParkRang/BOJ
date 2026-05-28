package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1197 {
	static int V, E;
	static int[] root, rank;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		node nodes[] = new node[E];
		
		for(int i = 0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			nodes[i] = new node(A, B, C);
		}
		
		rank = new int[V+1];
		root = new int[V+1];
		for(int i = 1; i<=V; i++) {
			root[i] = i;
		}
		
	
		Arrays.sort(nodes);

		int sum = 0;
		for(int i = 0; i<E; i++) {
			int from = nodes[i].from;
			int to = nodes[i].to;
			int weight = nodes[i].weight;
			
			if(find(from)!=find(to)) {
				sum = sum + weight;
				union(from, to);
			}
		}
		
		System.out.println(sum);
		
		for(int i = 1; i<=V; i++)
			System.out.print(rank[i] + " ");
		System.out.println();
		for(int i = 1; i<=V; i++)
			System.out.print(root[i] + " ");
		
	}
	
	static int find(int x) {
		if(root[x]==x)
			return x;
		return root[x] = find(root[x]);
	}
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y)
			return;
		
		if(rank[x]<rank[y]) {
			root[x] = y;
		} else {
			root[y] = x;
			if(rank[x]==rank[y])
				rank[x]++;
		}
	}
	
	
	static class node implements Comparable<node> {
		int from;
		int to;
		int weight;
		
		public node(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(node o) {
			return this.weight-o.weight;
		}
	}
}
