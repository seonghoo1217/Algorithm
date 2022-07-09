package programers.level1;

public class 나머지가1이되는수 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i=1;i<=n;i++){
                if(n%i==1) {
                    answer = i;
                    break;
                }
            }
            System.out.println("answer = " + answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution(10);
    }
}
