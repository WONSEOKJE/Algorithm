package inflearn.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class lecture5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        System.out.println(solution(arr));
    }

    private static int solution(char[] arr) {
        int result = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            } else if (arr[i] == ')') {
                if (arr[i - 1] == '(') {
                    stack.pop();
                    result += stack.size();
                } else {
                    stack.pop();
                    result ++;
                }
            }
        }

        return result;
    }
}
