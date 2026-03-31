package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj11948 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hap = 0;
		int num[] = new int[4];
		for(int i = 0; i<4; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		hap = num[1] + num[2] + num[3];
		num[0] = Integer.parseInt(br.readLine());
		num[1] = Integer.parseInt(br.readLine());
		hap = hap + Math.max(num[0], num[1]);
		System.out.println(hap);
	}
}
