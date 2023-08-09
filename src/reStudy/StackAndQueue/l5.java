package reStudy.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class l5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (s.charAt(i-1) == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
