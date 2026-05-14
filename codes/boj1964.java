package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1964 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int k = 4;
		int fives = 1;
		for(int i = 1; i<=N; i++) {
			fives = fives + k;
			fives = fives%45678;
			k = k+3;
		}
		System.out.println(fives);
		
	}
}
