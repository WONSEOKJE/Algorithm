package inflearn.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class lecture2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Meeting> arrayList = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayList.add(new Meeting(start, end));
        }

        System.out.println(solution(arrayList));
    }

    private static int solution(ArrayList<Meeting> arrayList) {
        int cnt = 0;
        int tmp = Integer.MIN_VALUE;
        Collections.sort(arrayList);
        for (Meeting m : arrayList) {
            if (m.start >= tmp) {
                tmp = m.end;
                cnt++;
            }
        }

        return cnt;
    }
}

class Meeting implements Comparable<Meeting> {
    int start;
    int end;
    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting m) {
        if (this.end - m.end == 0) return this.start - m.start;
        else return this.end - m.end;
    }
}