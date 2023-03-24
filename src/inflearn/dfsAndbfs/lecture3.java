package inflearn.dfsAndbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lecture3 {
    static int N,M;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        int[] time = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            score[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }
        DFS(0,0,0,score,time);
        System.out.println(max);
    }

    private static void DFS(int L, int s, int t, int[] score, int[] time) {
        if (t > M) return;
        if (L == N) {
            max = Math.max(max,s);
        } else {
            DFS(L + 1, s + score[L], t + time[L], score, time);
            DFS(L + 1, s, t, score, time);
        }
    }
}
