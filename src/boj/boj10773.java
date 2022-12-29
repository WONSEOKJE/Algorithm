package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                stack.pop();
            } else {
                stack.push(x);
            }
        }

        for (int x : stack) {
            sum += x;
        }

        System.out.println(sum);
    }
}
