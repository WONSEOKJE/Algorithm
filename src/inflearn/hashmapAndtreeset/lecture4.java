package inflearn.hashmapAndtreeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class lecture4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();
        char[] T = br.readLine().toCharArray();

        System.out.println(solution(S,T));
    }

    private static int solution(char[] S, char[] T) {
        int answer = 0;
        HashMap<Character, Integer> Tmap = new HashMap<>();
        HashMap<Character, Integer> Smap = new HashMap<>();
        for (int i = 0; i < T.length; i++) {
            Tmap.put(T[i], Tmap.getOrDefault(T[i],0) + 1);
            Smap.put(S[i], Smap.getOrDefault(S[i],0) + 1);
        }

        if (Tmap.equals(Smap)) {
            answer++;
        }

        int lt = 0;
        for (int rt = T.length; rt < S.length; rt++) {
            Smap.put(S[rt], Smap.getOrDefault(S[rt], 0) + 1);
            Smap.put(S[lt], Smap.get(S[lt]) - 1);
            if (Smap.get(S[lt]) == 0) {
                Smap.remove(S[lt]);
            }
            lt++;

            if (Tmap.equals(Smap)) {
                answer++;
            }
        }

        return answer;
    }
}
