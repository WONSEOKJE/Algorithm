package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 튜플 {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        s = s.substring(2, s.length()-2);
        s = s.replace("},{"," ");
        String[] arr = s.split(" ");

        //원소 개수 적은 순으로 나열
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        for(String str : arr) {
            String[] tmp = str.split(",");
            for(int i = 0; i < tmp.length; i++) {
                int x = Integer.parseInt(tmp[i]);

                if(!list.contains(x)) {
                    list.add(x);
                }
            }
        }

        return list;
    }
}
