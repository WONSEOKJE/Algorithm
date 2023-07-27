package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String answer = "YES";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        if (!s.equals(new StringBuilder(s).reverse().toString())) {
            answer = "NO";
        }

        System.out.println(answer);
    }
}
