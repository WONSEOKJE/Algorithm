package programmers.greedy;

import java.util.Arrays;

public class GymSuit { //프로그래머스 체육복 - 그리디
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(reserve);
        Arrays.sort(lost);

        boolean[] flag = new boolean[n + 1]; //여분 체육복 가져왔는데 빌려주지 못하는 경우의 배열 (잃어버렸거나 빌려줬거나)
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    flag[reserve[j]] = true;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i++) {
            if(flag[lost[i]]) continue;
            for(int j = 0; j < reserve.length; j++) {
                if((lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]) && !flag[reserve[j]]) {
                    answer++;
                    flag[reserve[j]] = true;
                    break;
                }
            }
        }

        return answer;
    }
}
