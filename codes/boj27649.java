package boj27649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj27649 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		char[] c = S.toCharArray();
		
		for(int i = 0; i<S.length(); i++) {
			if(c[i]=='(') {
				sb.append(" ( ");
			}
			else if(c[i]==')') {
				sb.append(" ) ");
			}
			else if(c[i]=='&') {
				sb.append(" && ");
				i++;
			}
			else if(c[i]=='|') {
				sb.append(" || ");
				i++;
			}
			else if(c[i]=='<') {
				sb.append(" < ");
			}
			else if(c[i]=='>') {
				sb.append(" > ");
			}
			else sb.append(c[i]);
		}
		StringTokenizer st = new StringTokenizer(sb.toString());
		sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()).append(" ");
		}
		System.out.println(sb);
	}
}
