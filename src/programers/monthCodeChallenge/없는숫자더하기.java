package programers.monthCodeChallenge;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class 없는숫자더하기 {
    static class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            HashMap<Integer,Integer> map=new LinkedHashMap<>();
            for (int i=0;i<=9;i++){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            for (int x:numbers){
                if (map.get(x)==1)map.replace(x,0);
            }
            for (int i=0;i<=9;i++){
                if(map.get(i)==1) answer+=i;
            }
            return answer;
        }

        /*class Solution {
            public int solution(int[] numbers) {
                int sum = 45;
                for (int i : numbers) {
                    sum -= i;
                }
                return sum;
            }
        }*/
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int arr[]={5,8,4,0,6,7,9};
        solution.solution(arr);
    }
}
