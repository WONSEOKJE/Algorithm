package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7576 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] tomato;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        tomato = new int[N][M];


        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if (tomato[i][j] == 1) {
                    queue.offer(new int[]{i,j});
                }
            }
        }

        System.out.println(bfs(N,M));
    }

    private static int bfs(int N, int M) {
        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i];
                int my = y + dy[i];
                if (mx < 0 || my < 0 || mx >= N || my >= M) {
                    continue;
                }
                if (tomato[mx][my] == 0) {
                    tomato[mx][my] = tomato[x][y] + 1;
                    queue.offer(new int[]{mx,my});
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0) {
                    return -1;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (max < tomato[i][j]) {
                    max = tomato[i][j];
                }
            }
        }

        if (max == 1) {
            return 0;
        } else {
            return max - 1;
        }
    }
}
