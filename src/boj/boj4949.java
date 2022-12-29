package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while(true) {
            s = br.readLine();

            if (s.equals(".")) {
                break;
            }

            sb.append(solution(s)).append("\n");
        }

        System.out.print(sb);
    }

    private static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            } else if (s.charAt(i) == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            answer = "yes";
        } else {
            answer = "no";
        }

        return answer;
    }
}
