package reStudy.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int lt = 0;
        int rt = s.length() - 1;
        char[] arr = s.toCharArray();

        while(lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                rt--;
                lt++;
            }
        }

        System.out.println(String.valueOf(arr));
    }
}
