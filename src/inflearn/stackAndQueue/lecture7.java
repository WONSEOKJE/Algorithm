package inflearn.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class lecture7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String require = br.readLine();
        String hyeonsu = br.readLine();
        System.out.println(solution(require, hyeonsu));
    }

    private static String solution(String require, String hyeonsu) {
        Queue<Character> queueRequire = new LinkedList<>();
        Queue<Character> queueHyeonsu = new LinkedList<>();

        for (int i = 0; i < require.length(); i++) {
            queueRequire.offer(require.charAt(i));
        }
        for (int i = 0; i < hyeonsu.length(); i++) {
            queueHyeonsu.offer(hyeonsu.charAt(i));
        }

        while (!queueHyeonsu.isEmpty()) {
            if (queueHyeonsu.peek() == queueRequire.peek()) {
                queueRequire.poll();
                queueHyeonsu.poll();
            } else {
                queueHyeonsu.poll();
            }
        }

        if (!queueRequire.isEmpty()) {
            return "NO";
        }

        return "YES";
    }
}
