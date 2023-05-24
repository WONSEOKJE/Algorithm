package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1182 {
    static int N,S;
    static int[] arr;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0,0);

        if (S == 0) System.out.println(cnt - 1);
        else System.out.println(cnt);
    }

    private static void DFS(int L, int sum) {
        if(L == N) {
            if (sum == S) {
                cnt++;
            }

            return;
        }

        DFS(L + 1, sum);
        DFS(L + 1, sum + arr[L]);
    }
}
