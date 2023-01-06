package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lecture12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(N,M,arr));
    }

    private static int solution(int N, int M, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int cnt = 0;
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < M; k++) {
                    int x = 0;
                    int y = 0;
                    for (int l = 0; l < N; l++) {
                        if (arr[k][l] == i) {
                            x = l;
                        }
                        if (arr[k][l] == j) {
                            y = l;
                        }
                    }
                    if (x < y) {
                        cnt++;
                    }
                }
                if (cnt == M) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
