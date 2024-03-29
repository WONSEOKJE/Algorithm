package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1759 {
    static int L,C;
    static char[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[C];
        visited = new boolean[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);

        combination(0,0);
    }

    private static void combination(int start, int cnt) {
        if (cnt == L) {
            int c = 0; //자음 개수
            int v = 0; //모음 개수
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < C; i++) {
                if (visited[i]) {
                    sb.append(arr[i]);

                    if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                        v++;
                    } else {
                        c++;
                    }
                }
            }

            if (v >= 1 && c >=2) {
                System.out.println(sb);
            }
        }

        for(int i = start; i < C; i++) {
            visited[i] = true;
            combination(i + 1, cnt + 1);
            visited[i] = false;
        }
    }
}
