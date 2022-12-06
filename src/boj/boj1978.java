package boj;

import java.util.Scanner;

public class boj1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (search(x)) {
                result++;
            }
        }

        System.out.println(result);
    }

    static boolean search(int x) {
        if (x == 1) {
            return false;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
