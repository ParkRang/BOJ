package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj32642 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		long rage = 0;
		long seq = 0;
		
		for(int i = 0; i<N; i++) {
			if(st.nextToken().equals("1")) {
				seq++;
				rage = rage + seq;
			} else {
				seq--;
				rage = rage + seq;
			}
		}
		System.out.println(rage);
	}
}
