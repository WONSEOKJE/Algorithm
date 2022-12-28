package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : solution(N,arr1,arr2)) {
            System.out.print(x + " ");
        }

    }

    private static int[] solution(int N, int[] arr1, int[] arr2) {
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if ((arr1[i] < arr1[j]) && (arr2[i] < arr2[j])) {
                    cnt++;
                }
            }
            answer[i] = cnt + 1;
        }

        return answer;
    }
}
