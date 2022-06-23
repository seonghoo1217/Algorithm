package programers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 문자내마음대로정렬하기 {
    static class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = {};
            ArrayList<String> arr =new ArrayList<>();

            for (int i=0;i<strings.length;i++){
                arr.add(strings[i].charAt(n)+strings[i]);
            }
            Collections.sort(arr);

            answer=new String[arr.size()];
            for (int i=0;i<arr.size();i++){
                answer[i]=arr.get(i).substring(1,arr.get(i).length());
            }
            for (int i=0;i<answer.length;i++){
                System.out.println("answer = " + answer[i]);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String arr[]={"sun", "bed", "car","bar"};
        solution.solution(arr,1);
    }
}
