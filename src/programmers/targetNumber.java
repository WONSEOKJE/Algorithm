package programmers;

public class targetNumber {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,0,target);
        return answer;
    }

    public void dfs(int[] numbers, int L, int sum, int target) {
        if (L == numbers.length) {
            if (sum == target) {
                answer++;
            }
        } else {
            dfs(numbers, L + 1, sum + numbers[L], target);
            dfs(numbers, L + 1, sum - numbers[L], target);
        }
    }
}
