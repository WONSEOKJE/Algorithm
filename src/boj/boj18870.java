package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sort = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            origin[i] = sort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sort);

        int num = 0;
        for (int x : sort) {
            if (!map.containsKey(x)) {
                map.put(x, num);
                num++;
            }
        }

        for (int x : origin) {
            int rank = map.get(x);
            sb.append(rank).append("\n");
        }

        System.out.println(sb);
    }
}
