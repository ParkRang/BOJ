package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long five = count_fives(N) - count_fives(M) - count_fives(N-M);
		long two = count_twos(N) - count_twos(M) - count_twos(N-M);
		if(M==0) {
			System.out.println(0);
		} else {
			System.out.println(Math.min(five, two));
		}
		
	}
	
	static long count_fives(long n) {
		long fives = 0;
		for(long i = 5; i<=n; i = i*5) {
			fives = fives + (n/i);
		}
		return fives;
	}
	
	static long count_twos(long n) {
		long twos = 0;
		for(long i = 2; i<=n; i = i*2) {
			twos = twos + (n/i);
		}
		return twos;
	}
}
