package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1240 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<List<int[]>> AL = new ArrayList<>();
		for(int i = 0; i<=N; i++)
			AL.add(new ArrayList<>());
		
		for(int i = 1; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			AL.get(A).add(new int[] {B, C});
			AL.get(B).add(new int[] {A, C});
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
		
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			boolean visited[] = new boolean[N+1]; 
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] {A, 0});
			visited[A] = true; 
			while(!q.isEmpty()) {
				int now[] = q.poll();
				if(now[0] == B) {
					sb.append(now[1]).append("\n");
					break;
				}
				visited[now[0]] = true;
				int len = AL.get(now[0]).size();
				for(int j = 0; j<len; j++) {
					if(!visited[AL.get(now[0]).get(j)[0]])
						q.add(new int[] {AL.get(now[0]).get(j)[0], AL.get(now[0]).get(j)[1] + now[1]});
				}
				
			}
			
		}
		
		
		System.out.print(sb);
	}
}
