package inflearn.array;

import java.util.Scanner;

public class lecture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }
}
