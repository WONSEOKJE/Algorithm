package inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class lecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }
        for (String s : solution(str)) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> solution (String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }
}
