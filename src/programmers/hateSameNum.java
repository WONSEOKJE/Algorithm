package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class hateSameNum {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        Queue<Integer> queue = new LinkedList<>();
        int num = -1;

        for(int i = 0; i < arr.length; i++) {
            if(num != arr[i]) {
                queue.offer(arr[i]);
            }
            num = arr[i];
        }

        System.out.println(queue);

        int[] answer = new int[queue.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }
    }
}
