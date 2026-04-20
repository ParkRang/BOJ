package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10424 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		b10424 b[] = new b10424[N];
		for(int i = 1; i<=N; i++) {
			b[i-1] = new b10424(i, Integer.parseInt(st.nextToken()));
		}
		StringBuilder sb  =new StringBuilder();
		Arrays.sort(b);
		for(int i = 0; i<N; i++) {
			sb.append(i - b[i].index+1).append("\n");
		}
		System.out.print(sb);
		
	}
	
	static class b10424 implements Comparable<b10424>{
		
		int index;
		int rank;
		
		b10424(int index, int rank){
			this.index = index;
			this.rank = rank;
		}
		
		public int compareTo(b10424 o) {
			return this.rank - o.rank;
		}
		
		
	}
}
