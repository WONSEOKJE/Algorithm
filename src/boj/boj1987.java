package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1987 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] graph = new int[21][21];
    static boolean[] visited = new boolean[26];
    static int R;
    static int C;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                graph[i][j] = s.charAt(j) - 'A';
            }
        }

        dfs(0,0,1);
        System.out.println(max);
    }

    private static void dfs(int x, int y, int cnt) {
        visited[graph[x][y]] = true;

        for (int i = 0; i < 4; i++) {
            int mx = x + dx[i];
            int my = y + dy[i];

            if (mx < 0 || my < 0 || mx >= R || my >= C) {
                continue;
            }

            if (!visited[graph[mx][my]]) {
                dfs(mx,my,cnt + 1);
                visited[graph[mx][my]] = false;
            }
        }

        max = Math.max(max, cnt);
    }
}
