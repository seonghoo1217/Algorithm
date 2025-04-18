package _2025._4month_3week;

public class 택배상자꺼내기 {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int row = (num - 1) / w;
        int wIdx = w - 1;
        int col = 0;

        if (row % 2 == 0) {
            col = (num - 1) % w;
        } else {
            col = wIdx - (num - 1) % w;
        }

        for (; row < (n + wIdx) / w; row++) {
            int aboveBox = 0;
            if (row % 2 == 0) {
                aboveBox = col + (row * w);
            } else {
                aboveBox = (wIdx - col) + (row * w);
            }
            if (aboveBox < n) {
                answer++;
            }
        }

        return answer;
    }
}
