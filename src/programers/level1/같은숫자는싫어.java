package programers.level1;

import java.util.*;

public class 같은숫자는싫어 {
    static public class Solution {
        public int[] solution(int []arr) {
            int[] answer = {};
            ArrayList<Integer> arrayList=new ArrayList<>();
            int temp=1217;
            for (int i=0;i<arr.length;i++){
                if (arr[i]!=temp){
                    arrayList.add(arr[i]);
                    temp=arr[i];
                }
            }
            answer=arrayList.stream().mapToInt(Integer::intValue).toArray();
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int arr[]={1,1,3,3,0,1,1};
        solution.solution(arr);
    }
}
