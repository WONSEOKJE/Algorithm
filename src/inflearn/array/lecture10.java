package inflearn.array;

import java.util.Scanner;

public class lecture10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mountain = new int[N+2][N+2];
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                mountain[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(N,mountain));
    }

    private static int solution(int N, int[][] mountain) {
        int cnt = 0;
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                if (mountain[i][j] > mountain[i-1][j] && mountain[i][j] > mountain[i][j-1]
                        && mountain[i][j] > mountain[i+1][j] && mountain[i][j] > mountain[i][j+1]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
