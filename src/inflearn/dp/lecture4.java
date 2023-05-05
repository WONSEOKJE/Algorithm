package inflearn.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class lecture4 {
    static int[] dy;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr.add(new Brick(s,h,w));
        }

        System.out.println(solution(arr));
    }

    private static int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            int max = 0;
            dy[i] = arr.get(i).h;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i).w < arr.get(j).w) {
                    max = Math.max(max,dy[j]);
                }
            }
            dy[i] += max;
            answer = Math.max(dy[i],answer);
        }
        
        return answer;
    }
}

class Brick implements Comparable<Brick> {
    int s;
    int h;
    int w;
    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}