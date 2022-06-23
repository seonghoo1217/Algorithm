package programers.level1;

public class 문자열을_정수로_바꾸기 {
    static class Solution {
        public int solution(String s) {
            int answer=0;
            return answer=Integer.parseInt(s);
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.solution("-1234"));
    }
}
