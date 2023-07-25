package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class l10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        char c = st.nextToken().charAt(0);

        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        for (int i = s.length() - 1; i  >= 0; i--) {
            if (s.charAt(i) == c) p = 0;
            else {
                p++;
                if (p < answer[i]) {
                    answer[i] = p;
                }
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }

    }
}
