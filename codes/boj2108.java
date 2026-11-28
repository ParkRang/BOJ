package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class boj2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num[] = new int[N];
		int countingArray[] = new int[8001];
		
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			countingArray[num[i]+4000]++;
		}
		
		Arrays.sort(num);
		
		StringBuilder sb = new StringBuilder();
		// 산술평균
		double avg = 0;
		for(int i = 0; i<N; i++) {
			avg = num[i] + avg;
		}
		avg = Math.round(avg/N);
		sb.append((int)avg).append("\n");
		
		// 중앙값
		sb.append(num[N/2]).append("\n");
		
		// 최빈값
		int count = 0;
		ArrayList<Integer> AL = new ArrayList<>();
		
		for(int i = 0; i<8001; i++) {
			if(countingArray[i]>count) {
				count = countingArray[i];
				AL.clear();
				AL.add(i-4000);
			} else if(countingArray[i]==count) {
				AL.add(i-4000);
			}
		}
		int k = 0;
		if(AL.size()>1) {
			k = AL.get(1);
		} else
			k = AL.get(0);
		
		sb.append(k).append("\n");
		
		// 범위
		sb.append(num[N-1]-num[0]).append("\n");
	
		System.out.println(sb);
	}
}
