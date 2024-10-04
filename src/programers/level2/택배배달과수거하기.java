package programers.level2;

public class 택배배달과수거하기 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        int d = 0;
        int p = 0;
        for (int i = n - 1; i >= 0; i--) {
            d -= deliveries[i];
            p -= pickups[i];

            while (d < 0 || p < 0) {
                d += cap;
                p += cap;
                answer += (i + 1) * 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int cap = 4;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        택배배달과수거하기 택배배달과수거하기 = new 택배배달과수거하기();
        long result = 택배배달과수거하기.solution(n, cap, deliveries, pickups);
        System.out.println("Minimum Distance: " + result); // 출력: Minimum Distance: 16
    }
}
