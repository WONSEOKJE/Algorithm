package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11724 {
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int v;
    static int e;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        int result = 0;

        for (int i = 1; i <= v; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }

    private static void dfs(int i) {
        if (visited[i]) {
            return;
        } else {
            visited[i] = true;
            for (int j = 1; j <= v; j++) {
                if (graph[i][j] == 1) {
                    dfs(j);
                }
            }
        }
    }
}
