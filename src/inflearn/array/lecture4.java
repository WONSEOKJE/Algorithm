package inflearn.array;

import java.util.Scanner;

public class lecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int x : solution(N)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int N) {
        int[] fibonacci = new int[N];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        return fibonacci;
    }
}
