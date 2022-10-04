package programers;


import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    static class Solution {
        public int[] solution(long l) {
            String S = String.valueOf(l);
            StringBuilder sb=new StringBuilder(S);
            sb = sb.reverse();
            String[] arr = sb.toString().split("");
            int[] intarr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            return intarr;
        }
    }

    /*public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution();
    }*/
}
