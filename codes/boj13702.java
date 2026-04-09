package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj13702 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int num[] = new int[N];
		
		long max = 0;
		
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			max = Math.max(num[i], max);
		}
		
		long l = 1;
		long r = max;
		while(l<=r) {
			long mid = (l+r)/2;
			long u = 0;
			for(int i = 0; i<N; i++) {
				u = u + num[i]/mid;
			}
			if(u>=K) {
				l = mid+1;
			} else {
				r = mid-1;
			}
		}
		
		System.out.println(r);
	}
}
