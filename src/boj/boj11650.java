package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        XY[] xyarr = new XY[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xyarr[i] = new XY(x,y);
        }

        Arrays.sort(xyarr, new Comparator<XY>() {
            @Override
            public int compare(XY xy1, XY xy2) {
                if (xy1.x == xy2.x) {
                    return xy1.y - xy2.y;
                }
                return xy1.x - xy2.x;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < xyarr.length; i++) {
            sb.append(xyarr[i]);
        }

        System.out.println(sb);
    }

    public static class XY {
        private int x;
        private int y;

        public XY (int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return x + " " + y + "\n";
        }
    }
}
