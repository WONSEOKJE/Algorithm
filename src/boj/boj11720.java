package boj;

import java.util.Scanner;

public class boj11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < T; i++) {
            sum += s.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
