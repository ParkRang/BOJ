package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj33939 {
	
	static ArrayList<Integer>[] AL;
	static ArrayList<Integer>[] RAL;
	static int N, M, cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cnt = 0;
		
		AL = new ArrayList[N+1];
		RAL = new ArrayList[N+1];
		
		for(int i = 1; i<=N; i++) {
			AL[i] = new ArrayList<>();
			RAL[i] = new ArrayList<>();
		}
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
		
			AL[u].add(v);
			RAL[v].add(u);
		}
		
		for(int i = 1; i<=N; i++)
			graphFinder(i);
		
		System.out.println(cnt);
	}
	
	static void graphFinder(int a) {
		for(int i = 0; i<AL[a].size(); i++) {
			int e = AL[a].get(i);
			
			for(int j = 0; j<RAL[e].size(); j++) {
				int r = RAL[e].get(j);

				if(a < r && !AL[a].contains(r)&&!RAL[a].contains(r)) {
					cnt++;
				}
			}
			
		}
		
	}
	
}
