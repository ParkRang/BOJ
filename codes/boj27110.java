package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj27110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int total = 0;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		total = total + Math.min(Integer.parseInt(st.nextToken()), N) + Math.min(Integer.parseInt(st.nextToken()), N) + Math.min(Integer.parseInt(st.nextToken()), N);
		
		System.out.println(total);
	}
}
