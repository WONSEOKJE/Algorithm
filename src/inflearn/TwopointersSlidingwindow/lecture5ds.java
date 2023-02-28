package inflearn.TwopointersSlidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lecture5ds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int cnt = 1;
        n--;
        while(n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }
}
