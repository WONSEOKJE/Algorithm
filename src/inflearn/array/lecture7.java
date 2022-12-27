package inflearn.array;

import java.util.Scanner;

public class lecture7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));

    }

    private static int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                arr[i] = cnt;
            }
            else {
                cnt = 0;
            }
        }

        for (int x : arr) {
            answer += x;
        }

        return answer;
    }
}
