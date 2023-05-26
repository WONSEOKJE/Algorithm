package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj2503 {
    static ArrayList<BaseBallData> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            list.add(new BaseBallData(num,strike,ball));
        }

        System.out.println(solution());
    }

    private static int solution() {
        int result = 0;
        for(int i = 123; i <= 987; i++) {
            if(SameNumOrContainsZero(i)) {
                continue;
            }

            int passCase = 0;
            for(BaseBallData bbd : list) {
                int strikeCnt = countStrike(String.valueOf(i), bbd.num);
                int ballCnt = countBall(String.valueOf(i), bbd.num);
                if (strikeCnt == bbd.strike && ballCnt == bbd.ball) {
                    passCase++;
                } else {
                    break;
                }
            }

            if(passCase == list.size()) {
                result++;
            }
        }

        return result;
    }

    private static int countStrike(String num1, String num2) {
        int cnt = 0;

        for(int i = 0; i < 3; i++) {
            if (num1.charAt(i) == num2.charAt(i)) {
                cnt++;
            }
        }

        return cnt;
    }

    private static int countBall(String num1, String num2) {
        int cnt = 0;

        for(int i = 0; i < 3; i++) { // 숫자는 같지만 다른 위치에 있는 개수 카운트
            if(num1.charAt(i) == num2.charAt((i+1) % 3) || num1.charAt(i) == num2.charAt((i+2) % 3)) {
                cnt++;
            }
        }

        return cnt;
    }

    private static boolean SameNumOrContainsZero(int x) { //123 ~ 987 돌면서 중복숫자있거나 0포함한 숫자 패스
        String num = String.valueOf(x);
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 3; i++) {
            set.add(num.charAt(i));
        }

        return set.contains('0') || set.size() != 3;
    }

    static class BaseBallData {
        String num;
        int strike;
        int ball;

        public BaseBallData(String num, int strike, int ball) {
            this.num = num;
            this.strike = strike;
            this.ball = ball;
        }
    }
}
