package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj32978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> AL = new ArrayList<>();
		while(st.hasMoreTokens()) {
			AL.add(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens())
			AL.remove((Object)st.nextToken());
		
		for(String e : AL)
		System.out.println(e);
	}
}
