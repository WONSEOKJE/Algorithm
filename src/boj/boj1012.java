package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1012 {
    static boolean[][] graph;
    static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            graph = new boolean[52][52];
            visit = new boolean[52][52];
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()) + 1;
                int y = Integer.parseInt(st.nextToken()) + 1;
                graph[x][y] = true;
            }

            for (int i = 1; i <= M; i++) {
                for (int j = 1; j <= N; j++) {
                    if (graph[i][j] && !visit[i][j]) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        int[] xArr = {1, -1, 0, 0};
        int[] yArr = {0, 0, 1, -1};

        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            if (graph[x + xArr[i]][y + yArr[i]] && !visit[x + xArr[i]][y + yArr[i]]) {
                dfs(x + xArr[i], y + yArr[i]);
            }
        }

    }
}
