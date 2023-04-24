package inflearn.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lecture1dfs {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dfs(0,N);
        System.out.println(cnt);
    }

    private static void dfs(int L, int N) {
        if (L > N) {
            return;
        }

        if (L == N) {
            cnt++;
        }
        else {
            dfs(L+1, N);
            dfs(L+2, N);
        }
    }
}
