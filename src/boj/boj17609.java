package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            String p = br.readLine();

            if (checkPalindrome(0, p.length() - 1, p)) {
                sb.append(0).append("\n");
            } else if (ReCheckPalindrome(0, p.length() - 1, p)) {
                sb.append(1).append("\n");
            } else {
                sb.append(2).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static boolean checkPalindrome(int lt, int rt, String p) {

        while(lt <= rt) {
            if (p.charAt(lt) != p.charAt(rt)) {
                return false;
            }
            lt++;
            rt--;
        }

        return true;
    }

    private static boolean ReCheckPalindrome(int lt, int rt, String p) {

        while(lt <= rt) {
            if (p.charAt(lt) != p.charAt(rt)) {
                boolean a = checkPalindrome(lt + 1, rt, p);
                boolean b = checkPalindrome(lt, rt - 1, p);
                if (!a && !b) {
                    return false;
                }
                else {
                    return true;
                }
            }

            lt++;
            rt--;
        }

        return true;
    }
}
