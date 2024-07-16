package baekjun.solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 랜선 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

        long[] lines = new long[K];
        long max = 0;
        for (int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, lines[i]); // 가장 긴 랜선 길이 갱신
        }

        long start = 1;
        long end = max;
        long answer = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long count = 0;

            for (long line : lines) {
                count += line / mid; // 현재 길이로 만들 수 있는 랜선 개수 계산
            }

            if (count >= N) { // N개 이상 만들 수 있으면 더 긴 길이 탐색
                start = mid + 1;
                answer = mid; // 답 갱신
            } else { // N개 미만이면 더 짧은 길이 탐색
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }

}
