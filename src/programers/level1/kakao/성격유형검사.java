package programers.level1.kakao;

import java.util.HashMap;

public class 성격유형검사 {
    static class Solution {
        public String solution(String[] survey, int[] choices) {
            String answer = "";
            HashMap<Character,Integer> hashMap =new HashMap<>();
            for (int i=0;i<survey.length;i++){
                if (choices[i]==4) answer+="";
                else if(choices[i]==1) {
                    hashMap.put(survey[i].charAt(0), hashMap.getOrDefault(survey[i].charAt(0),0)+3);
                }else if (choices[i]==2){
                    hashMap.put(survey[i].charAt(0), hashMap.getOrDefault(survey[i].charAt(0),0)+2);
                }else if (choices[i]==3){
                    hashMap.put(survey[i].charAt(0), hashMap.getOrDefault(survey[i].charAt(0),0)+1);
                }
                else if(choices[i]==5) {
                    hashMap.put(survey[i].charAt(1), hashMap.getOrDefault(survey[i].charAt(1),0)+1);
                }else if (choices[i]==6){
                    hashMap.put(survey[i].charAt(1), hashMap.getOrDefault(survey[i].charAt(1),0)+2);
                }else if (choices[i]==7){
                    hashMap.put(survey[i].charAt(1), hashMap.getOrDefault(survey[i].charAt(1),0)+3);
                }
            }


            System.out.println("hashMap = " + hashMap);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String survey[]={"AN", "CF", "MJ", "RT", "NA"};
        int choices[]={5, 3, 2, 7, 5};
        solution.solution(survey,choices);
    }
}
