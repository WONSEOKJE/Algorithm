package inflearn.string;

import java.util.Scanner;

public class lecture5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        System.out.println(soltion(arr));
    }

    private static String soltion(char[] arr) {
        String answer = "";
        int lt = 0;
        int rt = arr.length - 1;
        while(lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(arr);
        return answer;
    }
}
