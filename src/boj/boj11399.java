package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] line = new int[N];
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(line);

        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += line[j];
            }
            result += sum;
        }

        System.out.println(result);
    }
}
