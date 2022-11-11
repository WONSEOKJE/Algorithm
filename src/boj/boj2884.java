package boj;

import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (H == 0 && M - 45 < 0) {
            H = 23;
            M = 60 + M - 45;
        }
        else if (M - 45 < 0 && H < 24) {
            M = 60 + M - 45;
            H = H - 1;
        }
        else {
            M = M - 45;
        }
        System.out.println(H + " " + M);
    }
}
