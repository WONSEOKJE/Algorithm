package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] price = new int[N+1];
        int[] card = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            card[i] = price[i];
            for (int j = 1; j <= i; j++) {
                card[i] = Math.max(card[i], card[i-j] + price[j]);
            }
        }

        System.out.println(card[N]);
    }
}
