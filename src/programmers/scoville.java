package programmers;

import java.util.PriorityQueue;

public class scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : scoville) {
            pq.offer(x);
        }

        while(pq.peek() < K) {
            if(pq.size() < 2) {
                return -1;
            }

            int food1 = pq.poll();
            int food2 = pq.poll();

            int newFood = food1 + (2 * food2);
            answer++;

            pq.offer(newFood);
        }

        return answer;
    }
}
