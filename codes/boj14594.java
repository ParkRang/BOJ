package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj14594 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int K = Integer.parseInt(br.readLine());
		
		int rooms[] = new int[N+1];
		for(int i = 0; i<N+1; i++) {
			rooms[i] = i;
		}
		
		int mark = 0;
		
		b14594 b[] = new b14594[K];
		
		for(int i = 0; i<K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			b[i] = new b14594(x, y);
		}
		
		Arrays.sort(b);
		
		for(int i = 0; i<K; i++) {
			int x = b[i].s;
			int y = b[i].e;
			mark = rooms[x];
			for(int j = x; j<=y; j++) {
				rooms[j] = mark;
			}
		}
		
		boolean[] isTrue = new boolean[N+1];
		for(int i = 1; i<N+1; i++) {
			isTrue[rooms[i]] = true;
		}
		int cnt = 0;
		for(int i = 1; i<N+1; i++) {
			if(isTrue[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	static class b14594 implements Comparable<b14594>{
		int s;
		int e;
		
		b14594(int s, int e){
			this.s = s;
			this.e = e;
		}
		
		@Override
		public int compareTo(b14594 o) {
			if(this.s != o.s) 
				return this.s - o.s;
			return this.e - o.e;
		}
	}
}
