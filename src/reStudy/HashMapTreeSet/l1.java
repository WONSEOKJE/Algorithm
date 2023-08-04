package reStudy.HashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class l1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = c;
            }
        }

        System.out.println(answer);
    }
}
