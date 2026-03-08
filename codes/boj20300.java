package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj20300 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] t = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++)
			t[i] = Long.parseLong(st.nextToken());
		
		Arrays.sort(t);
		
		long[] p = new long[(N+1)/2];
		
		if(N%2==0) {
			int l = 0;
			int r = N-1;
			for(int i = 0; i<N/2; i++) {
				p[i] = t[l] + t[r];
				l++;
				r--;
			}
		} else {
			int l = 0;
			int r = N-2;
			for(int i = 0; i<N/2; i++) {
				p[i] = t[l] + t[r];
				l++;
				r--;
			}
			p[N/2] = t[N-1];
		}
		
		long high = 0;
		for(int i = 0; i<(N+1)/2; i++) {
			if(high<p[i]) {
				high = p[i];
			}
		}
		System.out.println(high);
	}
}
