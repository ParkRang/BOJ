package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2553 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long fact = 1;
		for(int i = 1; i<=N; i++) {
			fact = fact * (long)i;
			while(fact % 10 == 0) {
				fact = fact / 10;
			}
			fact = fact % 1000000;
		}
		System.out.println(fact%10);
	}
}
