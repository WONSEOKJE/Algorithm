package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2630 {
    public static int[][] paper;
    public static int white = 0;
    public static int blue = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0,0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    private static void divide(int x, int y, int N) {
        if (check(x, y, N)) {
            if (paper[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = N / 2;

        divide(x, y, newSize);
        divide(x, y + newSize, newSize);
        divide(x + newSize, y, newSize);
        divide(x + newSize, y + newSize, newSize);
    }

    private static boolean check(int x, int y, int N) {
        int color = paper[x][y];

        for (int i = x; i < x + N; i++) {
            for (int j = y; j < y + N; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
