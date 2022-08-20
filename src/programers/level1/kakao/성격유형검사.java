package programers.level1.kakao;

import chapter1.Palindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class 성격유형검사 {
    class Solution {
        int[] scoreList = {3, 2, 1, 0, 1, 2, 3};
        String indexString = "RTCFJMAN";
        public String solution(String[] survey, int[] choices) {
            String answer = "";
            Map<Character, Integer> map = new HashMap<Character, Integer>();

            for (int i = 0; i < indexString.length(); i++) {
                map.put(indexString.charAt(i), 0);
            }

            for (int i = 0; i < survey.length; i++) {
                char char1 = survey[i].charAt(0);
                char char2 = survey[i].charAt(1);

                int selectNum = choices[i];
                int selectScore = scoreList[selectNum - 1];

                if (selectNum < 4)
                    map.put(char1, map.get(char1) + selectScore);
                else if(selectNum > 4)
                    map.put(char2, map.get(char2) + selectScore);
            }

            for (int i = 0; i < indexString.length(); i += 2) {
                char index0 = indexString.charAt(i);
                char index1 = indexString.charAt(i + 1);

                if (!Objects.equals(map.get(index0), map.get(index1)) && map.get(index0) < map.get(index1))
                    answer += String.valueOf(index1);
                else
                    answer += String.valueOf(index0);
            }
            return answer;
        }
    }
}
