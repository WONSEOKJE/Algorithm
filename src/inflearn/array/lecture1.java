package inflearn.array;

import java.util.Scanner;

public class lecture1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }

    public static String solution(int[] arr) {
        String answer = "";
        answer += arr[0] + " ";
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                answer += arr[i] + " ";
            }
        }

        return answer;
    }
}
