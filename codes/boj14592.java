package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj14592 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		node n[] = new node[N];
		
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			n[i-1] = new node(s, c, l, i);
			
		}
		
		Arrays.sort(n);
		System.out.println(n[0].idx);
	}
	
	static class node implements Comparable<node> {
		int S;
		int C;
		int L;
		int idx;
		
		node(int S, int C, int L, int idx){
			this.S = S;
			this.C = C;
			this.L = L;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(node o) {
			if(this.S!=o.S)
				return o.S - this.S;
			if(this.C!=o.C)
				return this.C - o.C;
			return this.L - o.L;
		}
		
	}
}
