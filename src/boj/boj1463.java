package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1463 {
    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new Integer[N + 1];
        arr[0] = arr[1] = 0;

        System.out.println(solution(N));
    }

    private static int solution(int N) {

        if (arr[N] == null) {
            if (N % 6 == 0) {
                arr[N] = Math.min(solution(N - 1),Math.min(solution(N / 3), solution(N / 2))) + 1;
            } else if (N % 3 == 0) {
                arr[N] = Math.min(solution(N / 3), solution(N - 1)) + 1;
            } else if (N % 2 == 0) {
                arr[N] = Math.min(solution(N / 2), solution(N - 1)) + 1;
            } else {
                arr[N] = solution(N - 1) + 1;
            }
        }

        return arr[N];
    }

}
