package inflearn.dfsAndbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lecture9 {
    static int N,M;
    static int[] combi;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        combi = new int[M];
        DFS(0,1);
    }

    private static void DFS(int L, int S) {
        if (L == M) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = S; i <= N; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
