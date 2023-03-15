package inflearn.sortingAndsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lecture6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] tmp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            tmp[i] = arr[i];
        }

        Arrays.sort(tmp);
        for (int x : solution(N,arr,tmp)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int N, int[] arr, int[] tmp) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            if (arr[i] != tmp[i]) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
