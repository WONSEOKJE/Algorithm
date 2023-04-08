package inflearn.dfsAndbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class lecture12 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] tomato, dis;
    static Queue<Graph> queue = new LinkedList<>();
    static int M,N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        tomato = new int[N][M];
        dis = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int x = Integer.parseInt(st.nextToken());
                tomato[i][j] = x;
                dis[i][j] = x;
                if (tomato[i][j] == 1) {
                    queue.offer(new Graph(i,j));
                }
            }
        }

        BFS();
        System.out.println(check(dis));
    }

    private static void BFS() {
        while(!queue.isEmpty()) {
            Graph tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && tomato[nx][ny] == 0) {
                    tomato[nx][ny] = 1;
                    queue.add(new Graph(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    private static int check(int[][] dis) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dis[i][j] == 0) return -1;
                else max = Math.max(max, dis[i][j]);
            }
        }

        if (max == 1) {
            return 0;
        } else {
            return max - 1;
        }
    }
}

class Graph {
    public int x, y;
    Graph (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
