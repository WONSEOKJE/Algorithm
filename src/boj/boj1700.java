package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj1700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;

        int[] orders = new int[K];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < K; i++) {
            orders[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            for (int i = 1; i < K; i++) {
                if (orders[i] != orders[i-1]) {
                    cnt++;
                }
            }
        } else {
            HashSet<Integer> multi = new HashSet<>();

            for (int i = 0; i < K; i++) {
                int order = orders[i];
                if (multi.contains(order)) { //멀티탭에 이미 꽂혀있는 경우
                    continue;
                }
                if (multi.size() < N) { //멀티탭 자리가 있는 경우
                    multi.add(order);
                } else { // 멀티탭 꽉 차 있는 경우
                    HashSet<Integer> set = new HashSet<>(multi); //멀티탭 그대로 복사
                    for (int j = i + 1; j < K; j++) { //뒤 쪽에서 멀티탭 꽂혀있는 번호 있으면 복사한 set에서 삭제
                        if (set.contains(orders[j])) {
                            set.remove(orders[j]);
                        }
                        if (set.size() < 2) { // 사이즈 1되면 탈출
                            break;
                        }
                    }

                    multi.remove(set.iterator().next());
                    multi.add(order);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
