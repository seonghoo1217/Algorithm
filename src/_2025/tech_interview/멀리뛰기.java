package _2025.tech_interview;

public class 멀리뛰기 {
    long[] dp = new long[2001];

    public long solution(int n) {

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < 2001; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
