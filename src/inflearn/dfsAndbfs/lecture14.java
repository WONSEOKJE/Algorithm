package inflearn.dfsAndbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class lecture14 {
    static int N,M,len;
    static int answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> pizza, house;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp == 1) house.add(new Point(i,j));
                else if (tmp == 2) pizza.add(new Point(i,j));
            }
        }
        len = pizza.size();
        combi = new int[M];
        DFS(0,0);
        System.out.println(answer);
    }

    private static void DFS(int L, int s) {
        if (L == M) {
            int sum = 0;
            for (Point h : house) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }

            answer = Math.min(answer,sum);

        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
