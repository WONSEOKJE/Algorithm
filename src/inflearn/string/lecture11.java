package inflearn.string;

import java.util.Scanner;

public class lecture11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            }
            else {
                if (cnt > 1) {
                    answer += s.charAt(i) + String.valueOf(cnt);
                    cnt = 1;
                }
                else {
                    answer += s.charAt(i);
                }

            }
        }

        return answer;
    }
}
