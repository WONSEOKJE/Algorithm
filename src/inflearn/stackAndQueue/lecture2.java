package inflearn.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lecture2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";

        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cnt++;
                continue;
            } else if(c == ')') {
                cnt--;
                continue;
            }

            if (cnt == 0) {
                answer += c;
            }
        }

        return answer;
    }
}
