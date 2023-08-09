package reStudy.StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class l3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            int tmp = moves[i] - 1;
            for (int j = 0; j < N; j++) {
                if (board[j][tmp] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][tmp]) {
                        stack.pop();
                        cnt += 2;
                    } else {
                        stack.push(board[j][tmp]);
                    }
                    board[j][tmp] = 0;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
