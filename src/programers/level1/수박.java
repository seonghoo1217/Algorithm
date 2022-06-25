package programers.level1;

public class 수박 {
    static class Solution {
        public String solution(int n) {
            String answer="수" ;
            for (int i=1;i<n;i++){
                System.out.println("i = " + i);
                if(answer.charAt(i-1)=='수')answer+="박";
                else answer+="수";
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution(1000);
    }
}
