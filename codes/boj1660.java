package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1660 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num[] = new int[800];
		int tetra[] = new int[800];
		tetra[1] = 1;
		num[1] = 1;
		int t = 0;
		int k = 2;
		for(int i = 2; i<800; i++) {
			
			t = k + num[i-1];
			k++;
			num[i] = t;
			tetra[i] = num[i] + tetra[i-1];
			if(tetra[i]>300000) {
				break;
			}
		}
		
		int[] dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int value : tetra) {    
            for (int i = value; i <= N; i++) {
                if (dp[i - value] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - value] + 1);
                }
            }
        }

		System.out.println(dp[N]);
	}
}
