package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();
            if (s.equals("0")){
                break;
            }

            if (palindrome(s)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }

    }

    public static boolean palindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--){
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
