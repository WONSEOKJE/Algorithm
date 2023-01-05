package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sb.append(avg(N,arr)).append("\n").append(center(arr)).append("\n").append(manycnt(arr)).append("\n").append(size(arr));
        System.out.println(sb);
    }

    private static int avg(int N, int[] arr) {
        int answer = 0;
        for (int x : arr) {
            answer += x;
        }
        answer = (int) Math.round((double)answer / N);

        return answer;
    }

    private static int center(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        answer = arr[arr.length / 2];

        return answer;
    }

    private static int manycnt(int[] arr) {
        int answer = 0;
        int[] many = new int[8001];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int MAX = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            many[x + 4000]++;
        }

        for (int i = 0; i < many.length; i++) {
            if (MAX < many[i]) {
                MAX = many[i];
            }
        }
        for (int i = 0; i < many.length; i++) {
            if (MAX == many[i]) {
                arrayList.add(i);
            }
        }

        Arrays.sort(arrayList.toArray());

        if (arrayList.size() > 1) {
            answer = arrayList.get(1) - 4000;
        } else {
            answer = arrayList.get(0) - 4000;
        }

        return answer;
    }

    private static int size(int[] arr) {
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        for (int x : arr) {
            if (MAX < x) {
                MAX = x;
            }

            if (MIN > x) {
                MIN = x;
            }
        }

        return MAX - MIN;
    }
}
