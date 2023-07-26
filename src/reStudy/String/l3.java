package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        int max = 0;
        String answer = "";
        for (String x : arr) {
            if (x.length() > max) {
                max = x.length();
                answer = x;
            }
        }

        System.out.println(answer);
    }
}
