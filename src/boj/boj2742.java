package boj;

import java.util.Scanner;

public class boj2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int length = T;
        for (int i = 0; i < length; i++) {
            System.out.println(T);
            T--;
        }
    }
}
