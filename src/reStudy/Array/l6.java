package reStudy.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class l6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        for (String x : arr) {
            int reverse = reverse(x);
            if (isPrime(reverse)) {
                System.out.print(reverse + " ");
            }
        }
    }

    private static int reverse(String x) {
        x = new StringBuilder(x).reverse().toString();
        return Integer.parseInt(x);
    }

    private static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
