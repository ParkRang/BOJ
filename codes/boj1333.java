package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1333 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		int time = 0;
		int cooltime = 0;
		int songtime = 0;
		while(true) {
			if(songtime==0 && cooltime==0 && N>0) {
				songtime = L;
				cooltime = 5;
				N--;
			}
			if(songtime == 0) {
				cooltime--;
			}
			
			if(time%D==0 && songtime == 0)
				break;
			time++;
			if(songtime>0)
				songtime--;
			
		}
		
		System.out.println(time);
		
	}
}
