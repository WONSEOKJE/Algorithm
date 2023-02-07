package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int x = Integer.parseInt(st.nextToken());

                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
            }

            sb.append(min).append(" ").append(max).append("\n");
        }

        System.out.println(sb);
    }
}
