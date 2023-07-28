package programmers;

import java.util.ArrayList;

public class english {
    public static void main(String[] args) {
        String[] arr = {"hello", "one", "even", "never", "now", "world", "draw"};

        for (int x : solution(2,arr)) {
            System.out.print(x + " ");
        }
    }
    private static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i = 1; i < words.length; i++) {
            int x = list.get(i-1).length()-1;
            String s = list.get(i-1).substring(x);
            if(list.contains(words[i]) || !words[i].startsWith(s)) {
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            } else {
                list.add(words[i]);
            }
        }

        return answer;
    }
}
