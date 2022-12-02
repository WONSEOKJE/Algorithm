package boj;

import java.util.Scanner;

public class boj2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while (min != 0) {
            int gcd = max % min;
            max = min;
            min = gcd;
        }

        int lcm = a * b / max;

        System.out.println(max);
        System.out.println(lcm);
    }
}
