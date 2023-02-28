package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1780 {
    static int[][] paper;
    static int z,o,mo;
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

        divide(0,0,N);

        System.out.println(mo);
        System.out.println(z);
        System.out.println(o);
    }

    private static void divide(int x, int y, int N) {
        if (check(x,y,N)) {
            if (paper[x][y] == -1) {
                mo++;
            } else if (paper[x][y] == 1) {
                o++;
            } else {
                z++;
            }

            return;
        }

        int newSize = N / 3;

        divide(x,y,newSize);
        divide(x + newSize, y, newSize);
        divide(x + newSize * 2, y, newSize);
        divide(x,y + newSize,newSize);
        divide(x + newSize, y + newSize, newSize);
        divide(x + newSize * 2, y + newSize, newSize);
        divide(x,y + newSize * 2,newSize);
        divide(x + newSize, y + newSize * 2, newSize);
        divide(x + newSize * 2, y + newSize * 2, newSize);


    }

    private static boolean check(int x, int y, int N) {
        int tmp = paper[x][y];

        for (int i = x; i < x + N; i++) {
            for (int j = y; j < y + N; j++) {
                if (paper[i][j] != tmp) {
                    return false;
                }
            }
        }

        return true;
    }
}
