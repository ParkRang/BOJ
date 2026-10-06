package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj3613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int N = s.length();
		
		boolean isJava = true;
		boolean isC = true;
		
		for(int i = 0; i<N; i++) {
			if(s.charAt(i)=='_') {
				isJava = false;
			}
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				isC = false;
			}
			if(i==N-1&&s.charAt(i)=='_') {
				System.out.println("Error!");
				return;
			}
			if(i==0&&s.charAt(i)=='_') {
				System.out.println("Error!");
				return;
			}
			if(i==0&&s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				System.out.println("Error!");
				return;
			}
		}
		if(!isJava&&!isC) {
			System.out.println("Error!");
			return;
		}
		
		StringBuilder sb  =new StringBuilder();
		if(isJava&&isC)
			System.out.println(s);
		else if(isJava) {
			for(int i = 0; i<N; i++) {
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
					sb.append('_').append(String.valueOf(s.charAt(i)).toLowerCase());
				else
					sb.append(s.charAt(i));
			}
			System.out.println(sb);
		} else if(isC) {
			boolean is_ = false;
			for(int i = 0; i<N; i++) {
				if(s.charAt(i)=='_') {
					if(is_) {
						System.out.println("Error!");
						return;
					}
					is_ = true;
				}
				else {
					if(is_) {
						sb.append(String.valueOf(s.charAt(i)).toUpperCase());
						is_ = false;
					} else
						sb.append(s.charAt(i));
				}
			}
			System.out.println(sb);
		}
		
	}
}
