package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> mapI = new HashMap<>();
        HashMap<String, Integer> mapS = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String S = br.readLine();
            mapI.put(i,S);
            mapS.put(S,i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
           String S = br.readLine();
           if (isNum(S)) {
               sb.append(mapI.get(Integer.parseInt(S))).append("\n");
           } else {
               sb.append(mapS.get(S)).append("\n");
           }
        }

        System.out.println(sb);
    }

    private static boolean isNum(String S) {
        char[] arr = S.toCharArray();
        for (char c : arr) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
