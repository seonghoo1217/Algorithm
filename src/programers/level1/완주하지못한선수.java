package programers.level1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수 {
    static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String,Integer> map=new HashMap<>();
            for (String p:participant){
                map.put(p,map.getOrDefault(p,0)+1);
            }
            for (String p:completion){
                map.put(p,map.get(p)-1);
            }
            Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();

            while (iterator.hasNext()){
                Map.Entry<String,Integer> entry= iterator.next();
                if (entry.getValue()!=0){
                    answer=entry.getKey();
                    break;
                }
            }
            System.out.println(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String[]p={"marina", "josipa", "nikola", "vinko", "filipa"};
        String[]e={"josipa", "filipa", "marina", "nikola"};
        solution.solution(p,e);
    }
}
