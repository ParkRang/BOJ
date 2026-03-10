package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class boj26596 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int K = Integer.parseInt(st.nextToken());
			map.put(s, map.getOrDefault(s, 0)+K);
		}
		
		ArrayList<Integer> AL = new ArrayList<>();
		
		boolean isTrue = false;
		
		for(Entry<String, Integer> e : map.entrySet()) {
			int t = e.getValue();
			for(int A : AL) {
//				System.out.println((int)(A*1.618) + " " + (int) (t*1.618));
				if( (int)(A*1.618) == t || (int) (t*1.618) == A) {
					isTrue = true;
				}
			}
			AL.add(t);
		}
		System.out.println(isTrue?"Delicious!":"Not Delicious...");
		
	}
}
