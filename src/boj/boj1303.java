package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1303 {
    static int N,M;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static char[][] graph = new char[101][101];
    static boolean[][] visited = new boolean[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = s.charAt(j);
            }
        }

        int white = 0;
        int blue = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    if (graph[i][j] == 'W') {
                        white += Math.pow(dfs(i,j,'W'),2);
                    } else {
                        blue +=  Math.pow(dfs(i,j,'B'),2);
                    }
                }
            }
        }

        System.out.println(white + " " + blue);
    }

    private static int dfs(int x, int y, char color) {
        int cnt = 1;
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int mx = x + dx[i];
            int my = y + dy[i];

            if (mx >= 0 && my >= 0 && mx < M && my < N && !visited[mx][my] && graph[mx][my] == color) {
                cnt += dfs(mx, my, color);
            }
        }

        return cnt;
    }
}
