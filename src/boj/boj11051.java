package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11051 {
    static int[][] dp;
    final static int mod = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N+1][K+1];

        System.out.println(BC(N,K));
    }

    private static int BC(int N, int K) {
        if (dp[N][K] > 0) {
            return dp[N][K];
        }

        if (K == 0 || N == K) {
            return dp[N][K] = 1;
        }

        return dp[N][K] = (BC(N-1, K-1) + BC(N-1, K)) % mod;
    }
}
