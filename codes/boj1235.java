package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class boj1235 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] num = new String[N];
		for(int i = 0; i<N; i++) {
			num[i] = br.readLine();
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		boolean isTrue = true;
		int cnt = 0;
		int length = num[0].length();
		while(isTrue) {
			cnt++;
			map.clear();
			isTrue = false;
			for(int i = 0; i<N; i++) {
				map.put(num[i].substring(length-cnt), map.getOrDefault(num[i].substring(length-cnt), 0)+1);
				if(map.get(num[i].substring(length-cnt))>=2) {
					isTrue = true;
					break;
				}
			}
			
		}
		System.out.println(cnt);
	}
}
