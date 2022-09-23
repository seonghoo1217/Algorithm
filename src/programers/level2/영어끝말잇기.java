package programers.level2;

import java.util.ArrayList;

public class 영어끝말잇기 {
    static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            ArrayList<String> arr = new ArrayList();
            boolean flag = true;

            for (int i = 0; i < words.length; i++) {
                if (arr.contains(words[i])) {
                    answer[0]= (i%n)+1;
                    answer[1] = (i / n) + 1;
                    flag = false;
                    break;
                }

                arr.add(words[i]);

                if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    flag = false;
                    break;
                }
            }
            if (flag) return new int[]{0, 0};
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int n=3;
//        String [] arr={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String [] arr={"tank", "kick", "know", "know", "aa", "aas"};
        solution.solution(n,arr);
    }

}
