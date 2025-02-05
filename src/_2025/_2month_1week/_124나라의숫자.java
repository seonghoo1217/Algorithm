package _2025._2month_1week;

public class _124나라의숫자 {
    private static final char[] number = {'1', '2', '4'};

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            int remainder = n % 3;
            sb.append(number[remainder]);

            n /= 3;
        }

        return sb.reverse().toString();
    }
}
