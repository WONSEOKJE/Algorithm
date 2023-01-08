package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class boj11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (priorityQueueHighest.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(priorityQueueHighest.poll()).append("\n");
                }
            } else {
                priorityQueueHighest.add(x);
            }
        }

        System.out.print(sb);
    }
}
