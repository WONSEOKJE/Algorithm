package inflearn.dfsAndbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class lecture5 {
    static int N,M;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        M = Integer.parseInt(br.readLine());

        DFS(0,0,arr);
        System.out.println(min);
    }

    private static void DFS(int L, int sum, Integer[] arr) {
        if (L >= min) return;
        if (sum > M) return;
        if (sum == M) {
            min = Math.min(min, L);
        } else {
            for (int i = 0; i < N; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }
}
