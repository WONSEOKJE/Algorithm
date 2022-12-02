package boj;

import java.util.Scanner;

public class boj15829 {
    static final int r = 31;
    static final int M = 1234567891;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String s = sc.next();
        long pow = 1;
        long result = 0;

        for (int i = 0; i < L; i++) {
            result += (s.charAt(i) - 'a' + 1) * pow;
            pow = (pow * r) % M;
        }

        System.out.println(result % M);
    }
}
