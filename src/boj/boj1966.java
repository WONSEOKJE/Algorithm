package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                queue.offer(new int[] { j, Integer.parseInt(st.nextToken()) });
            }

            int count = 0;

            while(!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean Max = true;

                for (int j = 0; j < queue.size(); j++) {
                    if (front[1] < queue.get(j)[1]) {
                        queue.offer(front);
                        for (int k = 0; k < j; k++) {
                            queue.offer(queue.poll());
                        }

                        Max = false;
                        break;
                    }
                }

                if (!Max) {
                    continue;
                }

                count++;
                if (front[0] == M) {
                    break;
                }
            }

            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
