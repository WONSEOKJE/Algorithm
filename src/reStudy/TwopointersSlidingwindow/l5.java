package reStudy.TwopointersSlidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        int lt = 1;
        int rt = 2;
        while (rt != N / 2 + 2) {
            int sum = 0;
            for (int i = lt; i <= rt; i++) {
                sum += i;
            }

            if (sum == N) {
                answer++;
                rt++;
            } else if (sum < N) {
                rt++;
            } else {
                lt++;
            }
        }

        System.out.println(answer);
    }
}
