package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj16500 {
    static String S;
    static int N;
    static int[] dp = new int[101];
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        N = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            for (int j = i+1; j < S.length(); j++) {
                if (dp[j] == 1) {
                    if (set.contains(S.substring(i,j))) dp[i] = 1;
                }
            }
            if (set.contains(S.substring(i))) dp[i] = 1;
        }

        System.out.println(dp[0]);
    }
}
