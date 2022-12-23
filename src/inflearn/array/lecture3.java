package inflearn.array;

import java.util.Scanner;

public class lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        System.out.print(solution(A,B));
    }

    private static String solution(int[] A, int[] B) {
        String answer = "";

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                answer += "D\n";
            } else if ((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) {
                answer += "A\n";
            } else {
                answer += "B\n";
            }
        }

        return answer;
    }
}
