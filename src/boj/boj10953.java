package boj;

import java.util.Arrays;
import java.util.Scanner;

public class boj10953 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String s = sc.next();
            String[] strarr = s.split(",");
            System.out.println(Integer.parseInt(strarr[0]) + Integer.parseInt(strarr[1]));
        }
    }
}
