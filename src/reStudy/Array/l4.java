package reStudy.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fibo = new int[N];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < N; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for (int x : fibo) {
            System.out.print(x + " ");
        }
    }
}
