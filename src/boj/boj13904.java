package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj13904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<homeWork> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new homeWork(d,w));
        }
        Collections.sort(list);  //과제 일수 내림차순 정렬

        int sum = 0;
        for (int i = list.get(0).d; i > 0; i--) { //과제 일수 제일 많은 날부터 1일차까지 하나씩 내려감
            int max = 0;
            int idx = -1;
            for (homeWork h : list) { // 현재 일수보다 과제 일수가 큰 과제 중 점수가 가장 높은 과제의 점수 저장
                if (h.d < i) {
                    continue;
                }

                max = Math.max(max,h.w);
            }

            for (int j = 0; j < list.size(); j++) { // 과제 리스트 돌면서 해결한 과제 인덱스 번호 찾음
                if (list.get(j).d >= i && list.get(j).w == max) {
                    idx = j;
                }
            }

            if (idx != -1) { // 해결한 과제가 있다면 해당 과제 리스트에서 제외
                list.remove(idx);
            }

            sum += max;
        }

        System.out.println(sum);
    }

    private static class homeWork implements Comparable<homeWork>{
        int d;
        int w;
        public homeWork(int d, int w) {
            this.d = d;
            this.w = w;
        }

        @Override
        public int compareTo(homeWork o) {
            return o.d - this.d;
        }
    }
}
