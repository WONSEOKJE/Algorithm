package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] == -1) {
                continue;
            }

            for(int j = i; j < N; j++) {
                if(arr[j] > arr[i] && arr[j] < arr[i] + L) {
                    arr[j] = -1;
                }
            }
            arr[i] = -1;
            cnt++;
        }

        System.out.println(cnt);
    }
}
