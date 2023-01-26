package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9461 {
    static Long[] triangle;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            triangle = new Long[101];
            triangle[1] = 1L;
            triangle[2] = 1L;
            triangle[3] = 1L;
            triangle[4] = 2L;
            triangle[5] = 2L;

            int N = Integer.parseInt(br.readLine());
            if (N <= 5) {
                sb.append(triangle[N]).append("\n");
            } else {
                for (int i = 6; i <= N; i++) {
                    triangle[i] = triangle[i - 1] + triangle[i - 5];
                }
                sb.append(triangle[N]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
