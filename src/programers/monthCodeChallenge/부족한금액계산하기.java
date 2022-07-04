package programers.monthCodeChallenge;

public class 부족한금액계산하기 {
    static class Solution {
        public long solution(int price, int money, int count) {
            long answer=0;
            long temp=0;
            for (int i=1;i<=count;i++){
                temp+= (long) price *i;
            }
            if (money>=temp) return answer;
            else {
                answer=temp-money;
            }
            return answer;
        }
    }
/*
    return Math.max(price * (count * (count + 1) / 2) - money, 0);
*/

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.solution(3,20,4));
    }
}
