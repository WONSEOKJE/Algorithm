package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }

        System.out.println(answer);
    }
}
