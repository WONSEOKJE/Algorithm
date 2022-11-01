package boj;

import java.util.Scanner;

public class boj2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i+1) {
                count1++;
            } else if (arr[i] == arr.length - i) {
                count2++;
            }
        }
        if (count1 == 8) {
            System.out.println("ascending");
        } else if (count2 == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
