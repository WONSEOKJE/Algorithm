package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();
        String answer = "YES";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);
    }
}
