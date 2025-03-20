package _2025.tech_interview;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int N = prices.length;
        int[] cnt = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                cnt[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return cnt;
    }
}
