package programmers;

import java.util.*;

public class process {
    public int solution(int[] priorities, int location) {
        int target = 0;
        int answer = 1;
        Queue<Os> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new Os(priorities[i],i));
            if(location == i) {
                target = priorities[i];
            }
        }

        while(!queue.isEmpty()) {
            Os tmp = queue.poll();
            boolean flag = false;
            for(Os o : queue) {
                if(tmp.p < o.p) {
                    flag = true;
                    break;
                }
            }
            if(target <= tmp.p && location != tmp.l) {
                if(flag) {
                    queue.add(tmp);
                    continue;
                } else {
                    answer++;
                    continue;
                }
            } else if(target == tmp.p && location == tmp.l && !flag) {
                break;
            }

            queue.add(tmp);
        }


        return answer;
    }
}

class Os {
    int p;
    int l;
    public Os(int p, int l) {
        this.p = p;
        this.l = l;
    }
}
