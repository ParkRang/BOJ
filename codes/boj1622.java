package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String k = br.readLine();
            if (k == null) break;

            int[] freq1 = new int[26];
            int[] freq2 = new int[26];

            for (char c : s.toCharArray()) freq1[c - 'a']++;
            for (char c : k.toCharArray()) freq2[c - 'a']++;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                int common = Math.min(freq1[i], freq2[i]);
                for (int j = 0; j < common; j++) {
                    sb.append((char) (i + 'a'));
                }
            }
            System.out.println(sb.toString());
        }
    }
}

