package reStudy.String;
import java.util.*;
import java.io.*;
public class l2 {
    public static void main(String[] args) throws IOException {
        String answer = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(char x : s.toCharArray()) {
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }

        System.out.println(answer);
    }
}
