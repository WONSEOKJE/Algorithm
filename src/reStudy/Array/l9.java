package reStudy.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class l9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < N; j++) {
                sum1 += map[i][j];
                sum2 += map[j][i];
            }
            max = Math.max(sum1, max);
            max = Math.max(sum2, max);
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < N; i++) {
            sum1 += map[i][i];
            sum2 += map[N - i - 1][i];
        }
        max = Math.max(sum1, max);
        max = Math.max(sum2, max);

        System.out.println(max);
    }
}

