package codeupbasic100;

import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long sum = a+b+c;
        System.out.println(sum);
        System.out.printf("%.1f",(float)sum / 3);
    }
}
