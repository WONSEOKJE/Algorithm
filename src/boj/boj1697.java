package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1697 {
    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
            return;
        }

        bfs(N,K);
        System.out.println(visited[K] - 1);
    }

    private static void bfs(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();

        visited[N] = 1;
        queue.offer(N);

        while (visited[K] == 0) {
            int tmp = queue.poll();

            if (tmp - 1 >= 0 && visited[tmp - 1] == 0) {
                visited[tmp - 1] = visited[tmp] + 1;
                queue.offer(tmp - 1);
            }
            if (tmp + 1 < visited.length && visited[tmp + 1] == 0) {
                visited[tmp + 1] = visited[tmp] + 1;
                queue.offer(tmp + 1);
            }
            if (tmp * 2 < visited.length && visited[tmp * 2] == 0) {
                visited[tmp * 2] = visited[tmp] + 1;
                queue.offer(tmp * 2);
            }

        }
    }
}
