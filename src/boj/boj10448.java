package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] tri = new int[45];
        for (int i = 1; i < 45; i++) { // K가 1000까지이므로 44번 삼각수까지만 구해서 모두 저장해놓고 완전탐색
            tri[i] = (i * (i+1)) / 2;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            sb.append(search(K,tri)).append("\n");
        }

        System.out.println(sb);
    }

    private static int search(int K, int[] tri) {
        for(int i = 1; i < 45; i++) {
            for(int j = 1; j < 45; j++) {
                for(int k =1; k < 45; k++) {
                    if (K == tri[i] + tri[j] + tri[k]) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
