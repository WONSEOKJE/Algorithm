package inflearn.TwopointersSlidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lecture4ds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,M,arr));
    }

    private static int solution(int N, int M, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];
            if (sum == M) {
                answer++;
            }
            while(sum >= M) {
                sum -= arr[lt++];
                if (sum == M) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
