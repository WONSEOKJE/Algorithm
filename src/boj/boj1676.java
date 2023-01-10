package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }

    private static int solution(int N) {
        int answer = 0;

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 1; i <= N; i++) {
            int x = i;
            while (true) {
                if (x % 2 == 0) {
                    cnt1++;
                    x = x / 2;
                } else if (x % 5 == 0) {
                    cnt2++;
                    x = x / 5;
                } else {
                    break;
                }
            }
        }

        if (cnt1 == cnt2) {
            answer = cnt1;
        } else {
            answer = Math.min(cnt1,cnt2);
        }

        return answer;
    }
}
