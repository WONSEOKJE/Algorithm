package reStudy.HashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class l4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String S = br.readLine();
        String T = br.readLine();
        HashMap<Character, Integer> Smap = new HashMap<>();
        HashMap<Character, Integer> Tmap = new HashMap<>();

        for (int i = 0; i < T.length(); i++) {
            Tmap.put(T.charAt(i), Tmap.getOrDefault(T.charAt(i), 0) + 1);
            Smap.put(S.charAt(i), Smap.getOrDefault(S.charAt(i), 0) + 1);
        }

        if (Tmap.equals(Smap)) {
            answer++;
        }

        int lt = 0;
        for (int rt = T.length(); rt < S.length(); rt++) {
            Smap.put(S.charAt(rt), Smap.getOrDefault(S.charAt(rt), 0) + 1);
            Smap.put(S.charAt(lt), Smap.get(S.charAt(lt)) - 1);
            if (Smap.get(S.charAt(lt)) == 0) {
                Smap.remove(S.charAt(lt));
            }
            lt++;

            if (Tmap.equals(Smap)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
