package reStudy.TwopointersSlidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class l4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int rt = 0;
        int answer = 0;
        while (lt != N && rt != N) {
            int sum = 0;
            for (int i = lt; i < rt + 1; i++) {
                sum += arr[i];
            }

            if (sum == M) {
                answer++;
                rt++;
            } else if (sum < M) {
                rt++;
            } else {
                lt++;
            }
        }

        System.out.println(answer);
    }
}
