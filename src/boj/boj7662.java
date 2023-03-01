package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> queue = new TreeMap<>();

            for (int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                int n = Integer.parseInt(st.nextToken());

                if (c == 'I') {
                    queue.put(n, queue.getOrDefault(n, 0) + 1);
                } else {
                    if (queue.isEmpty()) {
                        continue;
                    }

                    if (n == 1) {
                        int max = queue.lastKey();
                        if (queue.get(max) == 1) {
                            queue.remove(max);
                        } else {
                            queue.put(max, queue.get(max) - 1);
                        }
                    } else {
                        int min = queue.firstKey();
                        if (queue.get(min) == 1) {
                            queue.remove(min);
                        } else {
                            queue.put(min, queue.get(min) - 1);
                        }
                    }
                }
            }

            if (queue.isEmpty()) {
                sb.append("EMPTY").append("\n");
            } else {
               sb.append(queue.lastKey()).append(" ").append(queue.firstKey()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
