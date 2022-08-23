package programers.level1.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class 신고결과받기 {

    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            HashMap<String,Integer> hashMap=new HashMap<>();
            HashMap<String,Integer> hashMap2=new HashMap<>();
            ArrayList<String> reporter=new ArrayList<>();
            ArrayList<String> reported=new ArrayList<>();
            int count =0;
            String temp1="";
            String temp2="";
            for (int i=0;i<id_list.length;i++){
                hashMap.put(id_list[i], hashMap.getOrDefault(hashMap.get(id_list[i]),0));
                hashMap2.put(id_list[i], hashMap.getOrDefault(hashMap.get(id_list[i]),0));
            }
            for (int i=0;i<report.length;i++){
                if (temp1.equals(report[i].split(" ")[0])&&temp2.equals(report[i].split(" ")[1])) count++;
                else count =0;
                if (count<1) {
                    reporter.add(report[i].split(" ")[0]);
                    reported.add(report[i].split(" ")[1]);
                }
                temp1=report[i].split(" ")[0];
                temp2=report[i].split(" ")[1];
            }
            for (int i=0;i<reported.size();i++){
                hashMap.put(reported.get(i), hashMap.get(reported.get(i))+1);
                if (hashMap.get(reported.get(i))==k){
                    for (int j=0;j<reported.size();j++){
                        if(reported.get(i).equals(reported.get(j))){
                            hashMap2.put(reporter.get(j),hashMap2.get(reporter.get(j))+1);
                        }
                    }
                }
            }
            LinkedList<Integer> answers=new LinkedList<>();
            for (int i=0;i<id_list.length;i++){
                answers.add(hashMap2.get(id_list[i]));
            }
            return answers.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String [] arr={"muzi", "frodo", "apeach", "neo"};
        String [] arr2={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k=2;
        solution.solution(arr,arr2,k);
    }
}
