package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj1461 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> PL = new ArrayList<>();
		ArrayList<Integer> ML = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		int num[] = new int[N];
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i] > 0) {
				PL.add(num[i]);
			} else
				ML.add(num[i]);
		}
		
		Collections.sort(ML);
		Collections.sort(PL, Collections.reverseOrder());
		
		int dist = 0;
		
		if(PL.size()==0) {
			dist = dist + Math.abs(ML.get(0));
			for(int i = 0; i<K; i++) {
				if(ML.size()<1) {
					continue;
				}
				ML.remove(0);
			}
			int count = K;
			while(ML.size()>0) {
				if(count==K) {
					dist = dist + Math.abs(ML.get(0))+ Math.abs(ML.get(0));
				}
				ML.remove(0);
				count--;
				if(count==0) {
					count = K;
				}
			}
			System.out.println(dist);
			return;
		}
		
		if(ML.size()==0) {
			dist = dist + PL.get(0);
			for(int i = 0; i<K; i++) {
				if(PL.size()<1) {
					continue;
				}
				PL.remove(0);
			}
			int count = K;
			while(PL.size()>0) {
				if(count==K) {
					dist = dist + PL.get(0)+ PL.get(0);
				}
				PL.remove(0);
				count--;
				if(count==0) {
					count = K;
				}
			}
			System.out.println(dist);
			return;
		}
		
		
		if(PL.get(0)>Math.abs(ML.get(0))) {
			dist = dist + PL.get(0);
			for(int i = 0; i<K; i++) {
				if(PL.size()<1) {
					continue;
				}
				PL.remove(0);
			}
		} else {
			dist = dist + Math.abs(ML.get(0));
			for(int i = 0; i<K; i++) {
				if(ML.size()<1) {
					continue;
				}
				ML.remove(0);
			}
		}
		int count = K;
		while(PL.size()>0) {
			if(count==K) {
				dist = dist + PL.get(0)+ PL.get(0);
			}
			PL.remove(0);
			count--;
			if(count==0) {
				count = K;
			}
		}
		
		count = K;
		while(ML.size()>0) {
			if(count==K) {
				dist = dist + Math.abs(ML.get(0)) + Math.abs(ML.get(0));
			}
			ML.remove(0);
			count--;
			if(count==0) {
				count = K;
			}
		}
		System.out.println(dist);
		return;
				
		
		
	}
}
