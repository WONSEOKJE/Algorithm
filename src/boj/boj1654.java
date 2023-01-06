package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        max++;
        System.out.println(solution(K,N,max,arr));
    }

    private static long solution(int K, int N, long max, int[] arr) {
        long min = 0;
        long mid = 0;

        while(min < max) {
            mid = (max + min) / 2;
            int cnt = 0;

            for (int i = 0; i < K; i++) {
                cnt += (arr[i] / mid);
            }

            if (cnt < N) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        return min - 1;
    }
}
