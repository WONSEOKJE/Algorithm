package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
        int result = Integer.MAX_VALUE;

        while (sub.hasMoreTokens()) {
            int x = 0;

            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");

            while (add.hasMoreTokens()) {
                x += Integer.parseInt(add.nextToken());
            }

            if (result == Integer.MAX_VALUE) {
                result = x;
            } else {
                result -= x;
            }
        }

        System.out.println(result);
    }
}
