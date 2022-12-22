package inflearn.string;

import java.util.Scanner;

public class lecture9ds2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        String answer = "";
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }
}