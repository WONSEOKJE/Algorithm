package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,M,arr));
    }

    private static long solution(int N, long M, int[] arr) {
        long answer = 0;
        long min = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if(max < arr[i]) {
                max = Math.max(max,arr[i]);
            }
        }

        while(min < max) {
            long result = 0;
            long mid = (max + min) / 2;

            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) {
                    result += (arr[i] - mid);
                }
            }

            if (result < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        answer = min - 1;

        return answer;
    }
}
