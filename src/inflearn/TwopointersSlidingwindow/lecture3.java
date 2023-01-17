package inflearn.TwopointersSlidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lecture3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] price = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,K,price));
    }

    private static int solution(int N, int K, int[] price) {
        int answer = 0;

        for (int i = K; i < N; i++) {
            int sum = 0;
            for (int j = i - K; j < i; j++) {
                sum += price[j];
            }
            answer = Math.max(answer,sum);
        }

        return answer;
    }
}
