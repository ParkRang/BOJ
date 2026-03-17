package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj13237 {
	static int N;
	static int[] degree;
	static ArrayList<Integer>[] AL;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		degree = new int[N+1];
		AL = new ArrayList[N+1];
		for(int i = 0; i<=N; i++) {
			AL[i] = new ArrayList<>();
		}
		int root = 0;
		
		for(int i = 1; i<=N; i++) {
			int A = Integer.parseInt(br.readLine());
			if(A==-1) {
				A = 0;
				root = i;
				degree[i] = 0;
			}
			AL[A].add(i);
		}
		
		dfs(root);
		for(int i = 1; i<= N; i++) {
			sb.append(degree[i]).append("\n");
		}
		System.out.print(sb);
		
	}
	
	static void dfs(int k) {		
		for(int i = 0; i<AL[k].size(); i++) {
			degree[AL[k].get(i)] = degree[k]+1; 
		}
		for(int i = 0; i<AL[k].size(); i++) {
			dfs(AL[k].get(i)); 
		}
		
	}
}
