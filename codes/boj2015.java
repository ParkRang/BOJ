package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj2015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Long K = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long num[] = new long[N+1];
		num[0]= 0;
		for(int i = 1; i<=N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		long x = 0;
		long sum = 0;
		Map<Long, Long> map = new HashMap<>();
		
		map.put(0L, 1L);
	
		for(int i = 1; i<=N; i++) {
			sum = sum + num[i];
			
			if(map.containsKey(sum - K))
				x = x + map.get(sum - K);
			
			map.put(sum, map.getOrDefault(sum, 0L)+1);
		}
		
		System.out.println(x);
	}
}
