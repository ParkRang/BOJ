package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2511 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1[] = new int[10];
		for(int i = 0; i<10; i++) {
			num1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int num2[] = new int[10];
		for(int i = 0; i<10; i++) {
			num2[i] = Integer.parseInt(st.nextToken());
		}
		
		double A = 0;
		double B = 0;
		
		for(int i = 0; i<10; i++) {
			if(num1[i]>num2[i]) {
				A = A+3 + 0.01*(i+1);
			} else if(num1[i]==num2[i]) {
				A++;
				B++;
			} else if(num1[i]<num2[i]){
				B = B+3 + 0.01*(i+1);
			}
		}
//		if(num1[9]>num2[9])
//			A = A + 0.1;
//		else if(num2[9]>num1[9])
//			B = B + 0.1;
		System.out.println((int) A + " " + (int) B);
		if(A==B)
			System.out.println("D");
		else
			System.out.println(A>B?"A":"B");
	}
}
