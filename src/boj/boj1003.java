package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] fibo0 = new int[41]; // 0 출력 수 담는 배열
            int[] fibo1 = new int[41]; // 1 출력 수 담는 배열

            fibo0[0] = 1; // N=0 일 때의 0 출력 수
            fibo0[1] = 0; // N=0 일 때의 1 출력 수
            fibo1[0] = 0; // N=1 일 때의 0 출력 수
            fibo1[1] = 1; // N=1 일 때의 1 출력 수

            solution(N,fibo0,fibo1);

            sb.append(fibo0[N] + " " + fibo1[N]).append("\n");
        }

        System.out.println(sb);
    }
    private static void solution(int N, int[] fibo0, int[] fibo1) {

        for (int i = 2; i <= N; i++) {
            fibo0[i] = fibo0[i-1] + fibo0[i-2]; // i번째 0 출력 수 담기
            fibo1[i] = fibo1[i-1] + fibo1[i-2]; // i번째 1 출력 수 담기
        }
    }
}
