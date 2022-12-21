package inflearn.string;

import java.util.Scanner;

public class lecture7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "YES";
        s = s.toUpperCase();
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                answer = "NO";
            }
        }

        return answer;
    }
}
