package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj13416 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i = 0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int num[][] = new int[N][3];
			int C = 0;
			for(int j = 0; j<N; j++) {
				st = new StringTokenizer(br.readLine());
				num[j][0] = Integer.parseInt(st.nextToken());
				num[j][1] = Integer.parseInt(st.nextToken());
				num[j][2] = Integer.parseInt(st.nextToken());
			
				int K = Math.max(num[j][0], Math.max(num[j][1], num[j][2]));
				if(K>0) {
					C = C + K;
				}
			}
			sb.append(C).append("\n");
		}
		System.out.print(sb);
	}
}
