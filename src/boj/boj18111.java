package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x : solution(N,M,B,arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int N, int M, int B, int[][] arr) {
        int[] answer = new int[2];
        answer[0] = Integer.MAX_VALUE;
        answer[1] = -1;
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                MAX = Math.max(MAX,arr[i][j]);
                MIN = Math.min(MIN,arr[i][j]);
            }
        }

        for (int i = MIN; i <= MAX; i++) {
            int block = B;
            int time = 0;

            for (int j  = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (arr[j][k] < i) {
                        time += i - arr[j][k];
                        block -= i - arr[j][k];
                    } else if (arr[j][k] > i) {
                        time += 2 * (arr[j][k] - i);
                        block += arr[j][k] - i;
                    }
                }
            }

            if (block >= 0 && time <= answer[0]) {
                if (i > answer[1]) {
                    answer[0] = time;
                    answer[1] = i;
                }
            }
        }

        return answer;
    }
}
