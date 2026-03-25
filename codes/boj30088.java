package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj30088 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long hap = 0;
		long num[] = new long[N];
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			for(int j = 0; j<K; j++) {
				num[i] = num[i] + Long.parseLong(st.nextToken());
			}
		}
		Arrays.sort(num);
		long sum = 0;
		for(int i = 0; i<N; i++) {
			hap = hap + num[i];
			sum = sum + hap;
		}
		System.out.println(sum);
	
	}
}
