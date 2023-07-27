package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s += " ";

        String answer = "";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) {
                answer += s.charAt(i);
                if (cnt != 1) {
                    answer += cnt;
                }
                cnt = 1;
            } else {
                cnt++;
            }
        }

        System.out.println(answer);
    }
}
