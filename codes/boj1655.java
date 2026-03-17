package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class boj1655 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> right = new PriorityQueue<>();
		
		int A = Integer.parseInt(br.readLine());
		sb.append(A).append("\n");	
		left.add(A);
		
		if(N>1) {
			A = Integer.parseInt(br.readLine());
			int l = left.poll();
			if(A>l) {
				left.add(l);
				right.add(A);
				sb.append(l).append("\n");
			} else {
				right.add(l);
				left.add(A);
				sb.append(A).append("\n");
			}
		}
		
		for(int i = 2; i<N; i++) {
			A = Integer.parseInt(br.readLine());
			int l = left.poll();
			int r = right.poll();
			if(A>=l&&A>=r) {
				right.add(A);
				left.add(l);
				if(left.size() > right.size()) {
					right.add(r);
				} else {
					left.add(r);
				}
			} else if(A<=l && A<=r) {
				left.add(A);
				right.add(r);
				if(left.size()>right.size()) {
					right.add(l);
				} else
					left.add(l);
			} else if(A>=l && A<=r) {
				left.add(l);
				right.add(r);
				if(left.size()>right.size()) {
					right.add(A);
				} else
					left.add(A);
			}
			
			sb.append(left.peek()).append("\n");
		}
		System.out.print(sb);
	}
}
