package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1260 {
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int N;
    static int M;
    static int V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(V);

        System.out.println();
        visited = new boolean[1001];

        bfs();
    }

    private static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        for (int i = 1; i <= N; i++) {
            if (graph[V][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);
        visited[V] = true;
        System.out.print(V + " ");

        while(!queue.isEmpty()) {
            int tmp = queue.poll();

            for (int i = 1; i <= N; i++) {
                if (graph[tmp][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
