package inflearn.sortingAndsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class lecture5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N,arr));
    }

    private static String solution(int N, int[] arr) {
        String answer = "U";
        Queue<Integer> queue = new LinkedList<>();
        for (int x : arr) {
            if (queue.contains(x)) {
                return "D";
            }
            queue.add(x);
        }

        return answer;
    }
}
