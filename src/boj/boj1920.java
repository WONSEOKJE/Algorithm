package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < arr2.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    cnt++;
                    break;
                }
            }
            if (cnt > 0) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }
}
