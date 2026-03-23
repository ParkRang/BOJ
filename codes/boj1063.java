package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String k = st.nextToken();
		String r = st.nextToken();
		int N = Integer.parseInt(st.nextToken());
		
		int kx = k.charAt(0)-'A'+1;
		int ky = k.charAt(1)-'0';
		int rx = r.charAt(0)-'A'+1;
		int ry = r.charAt(1)-'0';
		
		for(int i = 0; i<N; i++) {
			int pkx = kx;
			int pky = ky;
			int prx = rx;
			int pry = ry;
			
			String s = br.readLine();
			if(s.equals("R")) {
				kx = kx +1;
				if(rx==kx&&ry==ky)
					rx = rx+1;
			} else if(s.equals("L")) {
				kx = kx - 1;
				if(rx==kx&&ry==ky)
					rx = rx -1;
			} else if(s.equals("B")) {
				ky = ky - 1;
				if(rx==kx&&ry==ky)
					ry = ry - 1;
			} else if(s.equals("T")) {
				ky = ky + 1;
				if(rx==kx&&ry==ky)
					ry = ry + 1;
			} else if(s.equals("RT")) {
				kx = kx + 1;
				ky = ky + 1;
				if(rx==kx&&ry==ky) {
					rx = rx + 1;
					ry = ry + 1;
				}
			} else if(s.equals("LT")) {
				kx = kx - 1;
				ky = ky + 1;
				if(rx==kx&&ry==ky) {
					rx = rx - 1;
					ry = ry + 1;
				}
			} else if(s.equals("RB")) {
				kx = kx + 1;
				ky = ky - 1;
				if(rx==kx&&ry==ky) {
					rx = rx + 1;
					ry = ry - 1;
				}
			} else if(s.equals("LB")) {
				kx = kx - 1;
				ky = ky - 1;
				if(rx==kx&&ry==ky) {
					rx = rx - 1;
					ry = ry - 1;
				}
			}
			
			if(rx == 0 || ry == 0 ||rx == 9 || ry == 9) {
				rx = prx;
				ry = pry;
				kx = pkx;
				ky = pky;
			}
			if(kx == 0 ||ky == 0 || kx == 9 || ky == 9) {
				kx = pkx;
				ky = pky;
				rx = prx;
				ry = pry;
			}
		}
		String xp[] = {"", "A", "B", "C", "D", "E", "F", "G", "H"};
		System.out.print(xp[kx]);
		System.out.println(ky);
		System.out.print(xp[rx]);
		System.out.print(ry);
	}
}
