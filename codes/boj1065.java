package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
			
		ArrayList<Integer> AL = new ArrayList<>();
		
		for(int i = 1; i<=99; i++) {
			AL.add(i);
		}
		
		for(int i = 100; i<=999; i++) {
			int A = i/100;
			int B = (i%100)/10;
			int C = i%10;
			
			if(A-B==B-C) {
				AL.add(i);
			}
		}
		int cnt = 0;
		for(int i = 0; i<AL.size(); i++) {
			if(AL.get(i)<=N) {
				cnt++;
			}
			if(AL.get(i)>=N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
