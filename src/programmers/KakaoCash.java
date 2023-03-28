package programmers;

import java.util.*;

public class KakaoCash {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        String[] cache = new String[cacheSize];
        for(int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
            int pos = -1;
            for(int j = 0; j < cacheSize; j++) {
                if(cities[i].equals(cache[j])) {
                    pos = j;
                }
            }

            if (pos == -1) {
                for (int k = cacheSize - 1; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
                cache[0] = cities[i];
                answer += 5;
            } else {
                String tmp = cache[pos];
                for (int k = pos; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
                cache[0] = tmp;
                answer += 1;
            }
        }

        return answer;
    }
}