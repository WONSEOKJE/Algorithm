package inflearn.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class lecture4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                int x = stack.pop();
                int y = stack.pop();
                if (c == '+') {
                    stack.push(x + y);
                } else if (c == '-') {
                    stack.push(y - x);
                } else if (c == '*') {
                    stack.push(x * y);
                } else if (c == '/') {
                    stack.push(y / x);
                }
            }
        }

        result = stack.get(0);
        return result;
    }
}
