package programers.level1;

public class 행렬의덧셈 {
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            answer=new int[arr1.length][arr1[0].length];
            for (int i=0;i<arr1.length;i++){
                for (int k=0;k<arr1[0].length;k++){
                    answer[i][k]=arr1[i][k]+arr2[i][k];
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int arr1[][]={
                {1,2},{2,3}
        };
        int arr2[][]={
                {3,4},{5,6}
        };
        solution.solution(arr1,arr2);
    }
}
