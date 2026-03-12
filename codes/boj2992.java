package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2992 {
	static int N, max, len;
	static int num[];
	static boolean checked[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		N = Integer.parseInt(s);
		boolean isDown = true;
		for(int i = 0; i<s.length()-1; i++) {
			if(s.charAt(i)<s.charAt(i+1)) {
				isDown = false;
			}
		}
		if(isDown) {
			System.out.println(0);
			return;
		}
		len = s.length();
		num = new int[len];
		for(int i = 0; i<len; i++) {
			num[i] = s.charAt(i)-'0';
		}
		max = 9999999;
		checked = new boolean[len];
		
		pmtt(0, 0);
		System.out.println(max);
	}
	
	static void pmtt(int k, int depth) {
		if(depth==len) {
			if(k<max && k>N)
				max = k;
			return;
		}
		
		k = k * 10;
		for(int i = 0; i<len; i++) {
			if(!checked[i]) {
				checked[i] = true;
				pmtt(k + num[i], depth+1);
				checked[i] = false;
			}
		}
	}
	
	
}
