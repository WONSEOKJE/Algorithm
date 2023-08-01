package reStudy.TwopointersSlidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class l1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : solution(N,M,arr1,arr2)) {
            System.out.print(x + " ");
        }

    }

    private static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1 < N && p2 < M) {
            if (arr1[p1] < arr2[p2]) {
                arrayList.add(arr1[p1]);
                p1++;
            } else {
                arrayList.add(arr2[p2]);
                p2++;
            }
        }

        while (p1 < N) {
            arrayList.add(arr1[p1]);
            p1++;
        }

        while (p2 < M) {
            arrayList.add(arr2[p2]);
            p2++;
        }

        return arrayList;
    }
}
