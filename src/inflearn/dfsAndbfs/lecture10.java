package inflearn.dfsAndbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lecture10 {
    static int cnt = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] graph = new int[7][7];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(0,0);
        System.out.println(cnt);
    }

    private static void DFS(int i, int j) {
        graph[i][j] = 1;
        if (graph[6][6] == 1) {
            cnt++;
        } else {
            for (int k = 0; k < 4; k++) {
                if (i + dx[k] >= 0 && j + dy[k] >= 0 && i + dx[k] < 7 && j + dy[k] < 7 && graph[i+dx[k]][j+dy[k]] == 0) {
                    DFS(i + dx[k], j + dy[k]);
                    graph[i + dx[k]][j + dy[k]] = 0;
                }
            }
        }
    }
}
