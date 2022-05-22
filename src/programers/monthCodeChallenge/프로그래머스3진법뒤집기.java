package programers.monthCodeChallenge;

public class 프로그래머스3진법뒤집기 {
    class Solution {
        public int solution(int n) {
            String answer = "";

            while(n >= 3) {
                answer += n % 3;
                n /= 3;
            }
            answer += n;

            return Integer.parseInt(answer, 3);
        }
    }
}
