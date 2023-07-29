package programmers.greedy;

import java.util.Arrays;

public class boat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;
        for(int i = people.length - 1; index <= i; i--) {
            if(people[index] + people[i] <= limit) index++;
            answer++;
        }
        return answer;
    }
}
