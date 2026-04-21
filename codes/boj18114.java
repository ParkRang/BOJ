package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj18114 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int num[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i]==C) {
				System.out.println(1);
				return;
			}
		}
		
		Arrays.sort(num);
		int left = 0, right = N - 1;
	    while (left < right) {
	    	int sum = num[left] + num[right];
	        if (sum == C) {
	        	System.out.println(1);
	                return;
	            }
	        if (sum < C) left++;
	        else right--;
	    }


        for (int i = 0; i < N - 2; i++) {
            int target = C - num[i];
            left = i + 1;
            right = N - 1;

            while (left < right) {
                int sum = num[left] + num[right];
                if (sum == target) {
                    System.out.println(1);
                    return;
                }
                if (sum < target) left++;
                else right--;
            }
        }		
		
		System.out.println(0);
	}
}
