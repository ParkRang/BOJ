package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj20924 {
	static int N,R, branch, pillar, giga;
	static ArrayList<node>[] AL;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		branch = 0;
		pillar = 0;
		giga = R;

		
		AL = new ArrayList[N+1];
		for(int i = 0; i<=N; i++)
			AL[i] = new ArrayList<>();

		AL[R].add(new node(R, 0, 0));
		
		for(int i = 0; i<N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
		
			node nodeA = new node(A, B, D);
			node nodeB = new node(B, A, D);
			AL[A].add(nodeA);
			AL[B].add(nodeB);
		}
		boolean[] visited = new boolean[N+1];
		visited[0] = true;
		
		dfs1(R, 0, visited);

		dfs2(giga, 0, visited);
		
		System.out.println(pillar + " " + branch);
	}
	static void dfs1(int x, int d, boolean[] visited) {
		visited[x] = true;
		if(AL[x].size()<=2) {
			for(int i = 0; i<AL[x].size(); i++) {
				node A = AL[x].get(i);
				if(!visited[A.root]) {
					dfs1(A.root, d + A.dist, visited);
				}
			}
		} 
		if(pillar<d){
			pillar = d;
			giga = x;
		}
		
	}
	
	static void dfs2(int x, int d, boolean[] visited) {
		if(d>branch) {
			branch = d;
		}
		visited[x] = true;
		for(int i = 0; i<AL[x].size(); i++) {
			node A = AL[x].get(i);
			if(!visited[A.root]) {
				dfs2(A.root, d + A.dist, visited);
			}
		}

	}
	
	static class node {
		int number;
		int root;
		int dist;
		
		node(int number, int root, int dist){
			this.number = number;
			this.root = root;
			this.dist = dist;
		}
	}
}
