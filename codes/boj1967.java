package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj1967 {
	static int N, max;
	static ArrayList<edge>[] AL;
	static boolean visited[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		max = 0;
		
		AL = new ArrayList[N+1];
		for(int i = 0; i<=N; i++) {
			AL[i] = new ArrayList<>();
		}
		
		for(int i = 1; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			edge e1 = new edge(v, w);
			edge e2 = new edge(u, w);
			AL[u].add(e1);
			AL[v].add(e2);
		}
		for(int i = 1; i<=N; i++) {
			visited = new boolean[N+1];
			visited[i] = true;
			dfs(i, 0);
			
		}

		System.out.println(max);
	}
	
	static void dfs(int a, int b) {
		for(int i = 0; i<AL[a].size(); i++) {
			if(!visited[AL[a].get(i).to]) {
				visited[AL[a].get(i).to]=true;
				max = Math.max(max, b+AL[a].get(i).weight);
				dfs(AL[a].get(i).to, b + AL[a].get(i).weight);
			}
		}
	}
	
	static class edge{
		int to;
		int weight;
		
		edge(int to, int weight){
			this.to = to;
			this.weight = weight;
		}
	}
}
