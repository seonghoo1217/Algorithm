package programers.level1;

public class X만큼간격이있는N개의숫자 {
    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long temp=x;
            for(int i=0; i<answer.length; i++){
                answer[i]=temp;
                temp+=x;
            }
            System.out.println("answer = " + answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution(2,5);
    }
}
