package boj;

import java.util.Scanner;

public class boj2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt(); //층
            int n = sc.nextInt(); //호
            int[][] arr = new int[15][15];

            for (int j = 0; j < 15; j++) {
                arr[j][1] = 1;
                arr[0][j] = j;
            }

            for (int j = 1; j < 15; j++) {
                for (int l = 2; l < 15; l++) {
                    arr[j][l] = arr[j][l-1] + arr[j-1][l];
                }
            }

            System.out.println(arr[k][n]);
        }
    }
}
