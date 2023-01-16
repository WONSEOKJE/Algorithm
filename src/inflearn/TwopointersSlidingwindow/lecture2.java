package inflearn.TwopointersSlidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lecture2 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B);

        for (int x : solution(N,M,A,B)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int N, int M, int[] A, int[] B) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < N && p2 < M) {
            if (A[p1] == B[p2]) {
                answer.add(A[p1]);
                p1++;
                p2++;
            } else {
                if (A[p1] > B[p2]) {
                    p2++;
                } else {
                    p1++;
                }
            }
        }

        return answer;
    }
}
