package programmers;

public class 피로도 {
    static int[] visited;
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new int[dungeons.length];
        explore(0, k, dungeons);

        return answer;
    }

    private static void explore(int cnt, int k, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i] == 1 || dungeons[i][0] > k) {
                continue;
            }

            visited[i] = 1;
            explore(cnt + 1, k - dungeons[i][1], dungeons);
            visited[i] = 0;
        }

        answer = Math.max(answer, cnt);
    }
}
