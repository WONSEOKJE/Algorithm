package inflearn.string;

import java.util.Scanner;

public class lecture9ds1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;
        for (char c : s.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }
}
