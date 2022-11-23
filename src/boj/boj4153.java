package boj;

import java.util.Scanner;

public class boj4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
                System.out.println("right");
            } else if (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)) {
                System.out.println("right");
            } else if (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
