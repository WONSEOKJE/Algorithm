package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10845 {
    static int[] queue = new int[10001];
    static int first = 0;
    static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case  "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    private static void push(int x) {
        queue[last] = x;
        last++;
    }
    private static int pop() {
        if (last == first) {
            return -1;
        }
        int x = queue[first];
        first++;
        return x;
    }
    private static int size() {
        return last - first;
    }
    private static int empty() {
        if (last == first) {
            return 1;
        }
        return 0;
    }
    private static int front() {
        if (last == first) {
            return -1;
        }
        return queue[first];
    }
    private static int back() {
        if (last == first) {
            return -1;
        }
        return queue[last - 1];
    }
}
