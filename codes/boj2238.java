package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2238 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int num[] = new int[U+1];
		String names[] = new String[U+1];
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int K = Integer.parseInt(st.nextToken());
			if(num[K]==0) {
				names[K] = s;
			}
			num[K]++;
		}
		int index = 0;
		int std = 200000;
		for(int i = 1; i<=U; i++) {
			if(num[i]>0 && num[i]<std) {
				index = i;
				std = num[i];
			}
		}
		System.out.print(names[index]);
		System.out.print(" ");
		System.out.print(index);
	}
}
