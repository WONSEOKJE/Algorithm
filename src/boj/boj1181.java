package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class boj1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] strarr = new String[N];

        for (int i = 0; i < N; i++) {
            strarr[i] = br.readLine();
        }

        Arrays.sort(strarr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(strarr[0]).append("\n");

        for (int i= 1; i < N; i++) {
            if (!strarr[i].equals(strarr[i-1])) {
                sb.append(strarr[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
