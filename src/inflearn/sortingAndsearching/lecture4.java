package inflearn.sortingAndsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lecture4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] cache = new int[S];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            int pos = -1;
            for (int k = 0; k < S; k++) {
                if (num == cache[k]) {
                    pos = k;
                }
            }

            if (pos == -1) {
                for (int j = S - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = num;
            } else {
                int tmp = cache[pos];
                for (int j = pos; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = tmp;
            }
        }

        for (int x : cache) {
            System.out.print(x + " ");
        }
    }
}
