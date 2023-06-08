package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1904 {
    static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(solution(N));
    }

    private static int solution(int N) {
        if (dp[N] == -1) {
            dp[N] = (solution(N-1) + solution(N-2)) % 15746;
        }

        return dp[N];
    }
}
