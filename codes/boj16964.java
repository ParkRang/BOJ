package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj16964 {
	static int N, cnt;
	static boolean visited[];
	static HashSet<Integer>[] AL;
	static ArrayList<Integer> res = new ArrayList<>();
	static ArrayList<Integer> v = new ArrayList<>();
	static boolean isTrue;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		visited = new boolean[N+1];
		AL = new HashSet[N+1];
		for(int i = 0; i<=N; i++)
			AL[i] = new HashSet<>();
		
		for(int i = 1; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
		
			AL[u].add(v);
			AL[v].add(u);
		}
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		isTrue = true;
		cnt = 1;
		
		for(int i = 0; i<N; i++) {
			res.add(Integer.parseInt(st.nextToken()));
		}
		dfs(1);
		StringBuilder sb = new StringBuilder();
		s = s + " ";
		for(int e : v) {
			sb.append(e).append(" ");
			
		}
		if(!s.equals(sb.toString()))
			isTrue = false;
//		System.out.println(sb.toString());
//		System.out.println(s);
		
		System.out.println(isTrue?1:0);
	
	}
	
	static void dfs(int x) {
		if(visited[x])
			return;
//		System.out.println(x);
		v.add(x);
		
		visited[x] = true;
		for(int i = 0; i<AL[x].size(); i++) {
			if(cnt==N) {
				break;
			}
			int t = res.get(cnt);
			if(AL[x].contains(t)) {
				cnt++;
				
				dfs(t);
				
			}
		}
		
	}
}
