package boj;

import java.util.*;
import java.io.*;

public class boj11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<lectureRoom> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new lectureRoom(start,end));
        }

        Collections.sort(list);

        pq.add(list.get(0).end);

        for(int i = 1; i < N; i++) {
            if (list.get(i).start >= pq.peek()) {
                pq.poll();
            }

            pq.add(list.get(i).end);
        }

        System.out.println(pq.size());
    }


}

class lectureRoom implements Comparable<lectureRoom>{
    int start;
    int end;
    public lectureRoom(int start, int end) {
        this.start= start;
        this.end = end;
    }

    @Override
    public int compareTo(lectureRoom o) {
        if (this.start == o.start) {
            return this.end - o.end;
        }

        return this.start - o.start;
    }

}