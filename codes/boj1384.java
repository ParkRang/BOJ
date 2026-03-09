package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj1384 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		while(N!=0) {
			String name[] = new String[N];
//			boolean[][] isHate = new boolean[N][N];
			
			int K = N;
			ArrayList<int[]> AL = new ArrayList<>();
			for(int i = 0; i<N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				name[i] = st.nextToken();
				for(int j = 0; j<N-1; j++) {
					String s = st.nextToken();
					if(s.equals("N")) {
//						isHate[i][K-1] = true;
						AL.add(new int[] {i, K-1});
					}
					K--;
					if(K==0) K = N;
				}
				
			}
			
			boolean isNo = false;
			sb.append("Group ").append(cnt).append("\n");
			cnt++;
//			for(int i = 0; i<N; i++) {
//				for(int j = 0; j<N; j++) {
//					if(isHate[i][j]) {
//						sb.append(name[j]).append(" was nasty about ").append(name[i]).append("\n");
//						isNo = true;
//					}
//				}
//			}
			for(int[] e : AL) {
				sb.append(name[e[1]]).append(" was nasty about ").append(name[e[0]]).append("\n");
				isNo = true;
			}
			
			if(!isNo)
				sb.append("Nobody was nasty\n");
			sb.append("\n");
			N = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}
}
