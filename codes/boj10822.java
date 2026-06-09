package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		int num = 0;
		while(st.hasMoreTokens()) {
			num= Integer.parseInt(st.nextToken()) + num;
		}
		System.out.println(num);
	}
}
