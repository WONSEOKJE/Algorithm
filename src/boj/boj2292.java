package boj;

import java.util.Scanner;

public class boj2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int result = 0;


        for (int i = 0; i < N; i++) {
            count += 6*i;
            if (N == 1) {
                result = 1;
                break;
            }
            if (N <= count) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result);
    }
}
