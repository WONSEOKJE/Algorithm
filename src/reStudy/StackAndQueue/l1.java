package reStudy.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class l1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.add(s.charAt(i));
            else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = "NO";

        System.out.println(answer);
    }
}
