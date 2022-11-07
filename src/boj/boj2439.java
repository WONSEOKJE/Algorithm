package boj;

import java.util.Scanner;

public class boj2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = T-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < T; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
