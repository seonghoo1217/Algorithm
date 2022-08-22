package programers.level1;

import java.util.ArrayList;

public class 중첩된배열펼치기 {
    static class Solution {
        public int[] solution(int[][] arr){
            ArrayList<Integer> arrayList=new ArrayList<>();
            for (int i=0;i<arr.length;i++){
                int i1 = arr[i][0];
                arrayList.add(i1);
            }
            return arrayList.stream().mapToInt(Integer::intValue).toArray();
        }
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] arr={{1},{2},{3},{4},{5}};
        solution.solution(arr);
    }
}
