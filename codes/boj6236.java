package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj6236 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int num[] = new int[N];
		int max = 0;
		
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			max = Math.max(num[i], max);
		}
		int left = 0;
		int right = max;
		int res = 0;
		
		while(left <= right) {
			int mid = (left+right)/2;
			long sum = 0;
			for(int e : num) {
				if(e>mid) sum = sum + (e-mid);
			}
			if(sum >= M) {
				res = mid;
				left = mid+1;
			} else {
				right = mid -1;
			}
			
			
		}
		System.out.println(res);
	}
}
