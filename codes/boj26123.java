package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj26123 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		int num[] = new int[N];
		
		int max = 0;
		long hap = 0;
		st= new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i]>max) {
				max = num[i];
			}
		}
		int p = 0;
		if(max-D > 0) {
			p = max-D;
		}
		for(int i = 0; i<N; i++) {
			if(num[i]>p) {
				hap = hap + (long) num[i]-p;
			} 
		}
		System.out.println(hap);
	}
}
