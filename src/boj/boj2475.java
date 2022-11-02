package boj;

import java.util.Scanner;

public class boj2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(arr[i],2);
        }
        System.out.println(sum % 10);
    }
}
