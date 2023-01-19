package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2606 {
    static boolean[][] graph;
    static boolean[] visit;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        graph = new boolean[N+1][N+1];
        visit = new boolean[N+1];
        visit[1] = true;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = true;
        }

        System.out.println(solution(1));
    }

    private static int solution(int k) {

        answer++;
        visit[k] = true;

        for (int i = 1; i < graph.length; i++) {
            if (!visit[i] && graph[k][i]) {
                solution(i);
            }
        }

        return answer - 1;
    }
}
