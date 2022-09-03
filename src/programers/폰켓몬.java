package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 폰켓몬 {
    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            int length = nums.length / 2;
            HashMap<Integer, Integer> hashMap=new HashMap<>();
            for (int i=0;i<nums.length;i++){
                hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            }
            if(length>hashMap.keySet().size()){
                answer=hashMap.keySet().size();
            }else if (length==hashMap.keySet().size()){
                answer=length;
            }else{
                answer=length;
            }
            System.out.println("answer = " + answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int [] arr={3,3,3,2,2,4};
        solution.solution(arr);
    }
    //배울코드
    /*class Solution {
        public int solution(int[] nums) {
            int[] counts = new int[200001];
            int answer = 0;
            for(int i = 0; i < nums.length; i++) {
                if(counts[nums[i]] == 0) {
                    answer++;
                }
                counts[nums[i]]++;
            }
            if(answer > nums.length / 2) {
                answer = nums.length / 2;
            }
            return answer;
        }
    }*/
}
