package programers.level1;

import java.util.ArrayList;

public class 모의고사 {
    static class Solution {
        public static ArrayList<Integer> solution(int[] answers) {
            int[] person1 = {1,2,3,4,5};
            int[] person2 = {2,1,2,3,2,4,2,5};
            int[] person3 = {3,3,1,1,2,2,4,4,5,5};
            int answer1=0, answer2 =0, answer3 =0;

            for(int i =0; i<answers.length; i++){
                if(person1[i%person1.length] == answers[i]) answer1++;
                if(person2[i%person2.length] == answers[i]) answer2++;
                if(person3[i%person3.length] == answers[i]) answer3++;
            }
            int max = Math.max(Math.max(answer1, answer2),answer3);
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(max==answer1) list.add(1);
            if(max==answer2) list.add(2);
            if(max==answer3) list.add(3);

            return list;
        }
    }

    public static void main(String[] args) {
        Solution N=new Solution();
        int arr[]={1,2,3,4,5,1,2,3,4,5,444,332,21,2,1,2,5,6};
        System.out.println(N.solution(arr));
    }
}
