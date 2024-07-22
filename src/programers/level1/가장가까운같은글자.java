package programers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        char[] words = s.toCharArray();
        for (int i = 0; i < words.length; i++) {
            char word = words[i];
            if (map.get(word) != null) {
                answer[i] = i + 1 - map.get(word);
                map.put(word, i + 1);
            } else {
                map.put(word, i + 1);
                answer[i] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        가장가까운같은글자 solved = new 가장가까운같은글자();
        int[] bananas = solved.solution("banana");
        Arrays.stream(bananas).forEach(System.out::println);
    }
}
