package reStudy.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        int answer = 0;
        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= N; j=i+j) {
                    arr[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }
}
