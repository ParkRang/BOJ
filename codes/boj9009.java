package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj9009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> AL = new ArrayList<>();
		int l = 0;
		int r = 1;
		AL.add(1);
		AL.add(2);
		while(true) {
			int C = AL.get(l)+AL.get(r);
			l++; r++;
			if(C>1000000000) {
				break;
			}
			AL.add(C);
		}
		
		int z = AL.size();
		for(int i = 0; i<N; i++) {
			ArrayList<Integer> num  = new ArrayList<>();
			int K = Integer.parseInt(br.readLine());
			for(int j = z-1; j>=0; j--) {
				if(AL.get(j)<=K) {
					K = K-AL.get(j);
					num.add(AL.get(j));
				}
			}
			Collections.sort(num);
			for(int e : num) {
				sb.append(e).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
