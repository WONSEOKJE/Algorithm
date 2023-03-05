package inflearn.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class lecture2ds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                while(stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }

        for (char c : stack) {
            answer += c;
        }

        return answer;
    }
}
