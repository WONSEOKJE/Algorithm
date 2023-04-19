package inflearn.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class lecture3 {
    static ArrayList<Friend> arrayList = new ArrayList<>();
    static int cnt = 0;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayList.add(new Friend(start, 's'));
            arrayList.add(new Friend(end, 'e'));
        }

        System.out.println(solution());
    }

    private static int solution() {

        Collections.sort(arrayList);

        for (Friend f : arrayList) {
            if (f.se == 's') {
                cnt++;
            } else {
                cnt--;
            }

            max = Math.max(max,cnt);
        }

        max = Math.max(max,cnt);
        return max;
    }
}

class Friend implements Comparable<Friend> {
    int time;
    char se;
    Friend(int time, char se) {
        this.time = time;
        this.se = se;
    }

    @Override
    public int compareTo(Friend f) {
        if (f.time == this.time) return this.se - f.se;
        else return this.time - f.time;
    }
}