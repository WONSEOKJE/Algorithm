package reStudy.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class l12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                int A = 0;
                int B = 0;
                int cnt = 0;
                for (int k = 0; k < M; k++) { //배열을 돌면서 멘토번호와 멘티번호를 찾음
                    for (int l = 0; l < N; l++) {
                        if (arr[k][l] == i) { //멘티번호 찾으면 A에 저장
                            A = l;
                        }
                        if (arr[k][l] == j) { //멘토번호 찾으면 B에 저장
                            B = l;
                        }
                    }

                    if (A > B) { //멘토 등수가 멘티 등수보다 위면 카운트
                        cnt++;
                    }
                }

                if (cnt == M) { //카운트 수가 M과 같으면 올바른 멘토 멘티
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
