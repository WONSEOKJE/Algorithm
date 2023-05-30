package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 센서를 오름차순으로 정렬

        Integer[] diff = new Integer[N-1];
        for(int i = 0; i < N-1; i++) {
            diff[i] = arr[i+1] - arr[i]; // 오름차순 정렬된 센서 간의 거리를 따로 배열에 저장
        }
        Arrays.sort(diff, Collections.reverseOrder()); //센서 간의 거리를 내림차순으로 정렬

        /*
        센서 간의 거리가 먼 곳에 집중국을 배치하게 되면 집중국의 수신 가능 영역의 길이의 합의 최솟값을 구할 수 있음
        따라서 센서 간의 거리가 가장 먼 곳부터 집중국의 개수에 따라 하나씩 제외하면 됨 (그래서 시작이 K - 1)
         */
        int sum = 0;
        for (int i = K - 1; i < diff.length; i++) {
            sum += diff[i];
        }

        System.out.println(sum);
    }
}
