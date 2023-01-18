package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2579 {
    static Integer[] score;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        score = new Integer[N+1];
        arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        score[0] = arr[0];
        score[1] = arr[1];

        if (N >= 2) {
            score[2] = score[1] + arr[2];
        }

        System.out.println(solution(N));
    }

    private static int solution(int N) {

        if (score[N] == null) {
            score[N] = Math.max(solution(N - 2), solution(N - 3) + arr[N - 1]) + arr[N];
        }

        return score[N];
    }
}
