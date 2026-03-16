package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1138 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[N];
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int arrays[] = new int[N];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<N; i++) {
			int K = num[i];
			for(int j = 0; j<N; j++) {
				if(arrays[j]==0 && K==0) {
					arrays[j] = i+1;
				} else if(arrays[j]!=0) {
					continue;
				}
				K--;
			}
		}
		
		for(int e : arrays) {
			sb.append(e).append(" ");
		}
		System.out.print(sb);
	}

}
