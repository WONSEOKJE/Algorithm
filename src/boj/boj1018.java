package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1018 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true; // W 일때 true
                } else {
                    arr[i][j] = false; // B 일때 false
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i,j);
            }
        }
        System.out.println(min);
    }

    public static void find (int x, int y) {
        int end_i = x + 8;
        int end_j = y + 8;
        int count = 0;

        boolean WB = arr[x][y]; //첫번째 칸의 색

        for (int i = x; i < end_i; i++) {
            for (int j = y; j < end_j; j++) {
                if (arr[i][j] != WB) {
                    count++;
                }
                WB = !WB;
            }
            WB = !WB;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);

    }
}
