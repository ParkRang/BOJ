package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5522 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = 0;
		for(int i = 0; i<5; i++) {
			A = A + Integer.parseInt(br.readLine());
		}
		System.out.println(A);
	}
}
