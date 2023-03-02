package inflearn.hashmapAndtreeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class lecture2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        String s1 = br.readLine();
        String s2 = br.readLine();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        System.out.println(solution(map1, map2));
    }

    private static String solution(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        for (char c : map1.keySet()) {
            if (map1.get(c) != map2.get(c)) {
                return "NO";
            }
        }

        return "YES";
    }
}
