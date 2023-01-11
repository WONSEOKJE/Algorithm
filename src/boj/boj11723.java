package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj11723 {
    public static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "add" :
                    add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove" :
                    remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check" :
                    sb.append(check(Integer.parseInt(st.nextToken()))).append("\n");
                    break;
                case "toggle" :
                    toggle(Integer.parseInt(st.nextToken()));
                    break;
                case "all" :
                    all();
                    break;
                case "empty" :
                    empty();
                    break;
            }
        }

        System.out.println(sb);
    }
    private static void add(int x) {
        set.add(x);
    }
    private static void remove(int x) {
        set.remove(x);
    }
    private static int check(int x) {
        if (set.contains(x)) {
           return 1;
        }

        return 0;
    }
    private static void toggle(int x) {
        if (set.contains(x)) {
            set.remove(x);
        } else {
            set.add(x);
        }
    }
    private static void all() {
        for (int i = 0; i < 20; i++) {
            set.add(i+1);
        }
    }
    private static void empty() {
        set.clear();
    }
}
