package inflearn.hashmapAndtreeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class lecture3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : solution(N, K, arr)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int N, int K, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < K - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        int lt = 0;
        for (int rt = K - 1; rt < N; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }
}
