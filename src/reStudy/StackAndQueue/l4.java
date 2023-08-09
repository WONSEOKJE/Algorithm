package reStudy.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;

public class l4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Integer> stack = new Stack<>();
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
                } else {
                    stack.push(y / x);
                }
            }
        }

        System.out.println(stack.pop());
    }
}
