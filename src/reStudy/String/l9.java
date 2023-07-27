package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll("[^0-9]", "");
        int answer = Integer.parseInt(s);

        System.out.println(answer);
    }
}
