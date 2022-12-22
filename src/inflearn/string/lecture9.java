package inflearn.string;

import java.util.Scanner;

public class lecture9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        s = s.replaceAll("[^0-9]", "");
        return Integer.parseInt(s);
    }
}
