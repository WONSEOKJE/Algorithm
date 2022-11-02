package boj;

import java.util.Scanner;

public class boj11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
