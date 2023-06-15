package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10026 {
    static char[][] map,rgMap;
    static boolean[][] check,rgCheck;
    static int N;
    static int cnt, rgCnt = 0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        rgMap = new char[N][N];
        check = new boolean[N][N];
        rgCheck = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j);

                if (s.charAt(j) == 'G') rgMap[i][j] = 'R';
                else rgMap[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!check[i][j]) {
                    dfs(i,j,check,map,map[i][j]);
                    cnt++;
                }
                if (!rgCheck[i][j]) {
                    dfs(i,j,rgCheck,rgMap,rgMap[i][j]);
                    rgCnt++;
                }
            }
        }

        System.out.println(cnt + " " + rgCnt);
    }

    private static void dfs(int x, int y, boolean[][] check, char[][] map, char color) {
        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !check[nx][ny] && map[nx][ny] == color) {
                dfs(nx,ny,check,map,color);
            }
        }
    }
}
