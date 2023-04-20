package inflearn.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class lecture4 {
    static ArrayList<Lecture> arrayList = new ArrayList<>();
    static int n;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arrayList.add(new Lecture(m,d));
            if (d > max) max = d;
        }

        System.out.println(solution());
    }

    private static int solution() {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arrayList);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for ( ; j < n; j++) {
                if (arrayList.get(j).day < i) break;
                priorityQueue.offer(arrayList.get(j).money);
            }
            if (!priorityQueue.isEmpty()) answer += priorityQueue.poll();
        }

        return answer;
    }
}

class Lecture implements Comparable<Lecture> {
    public int money;
    public int day;
    Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture l) {
        return l.day - this.day;
    }
}
