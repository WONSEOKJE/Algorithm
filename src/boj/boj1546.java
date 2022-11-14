package boj;

import java.util.Scanner;

public class boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double max = 0;
        double sum = 0;
        double avg;
        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < N; i++) {
            sum += arr[i] / max * 100;
        }
        avg = sum / N;
        System.out.println(avg);
    }
}
