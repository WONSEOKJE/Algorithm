package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11727 {
    static int[] arr = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 5;
        for (int i = 4; i <= n; i++) {
            arr[i] = (arr[i - 1] + 2 * arr[i - 2]) % 10007;
        }

        System.out.println(arr[n]);
    }
}
