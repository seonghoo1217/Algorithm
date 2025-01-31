package _2025._1month4week.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 도로의_개수_1577 {
    /*
    6 6
    2
    0 0 0 1
    6 6 5 6
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[][] dp = new long[n + 1][m + 1];

        int k = Integer.parseInt(br.readLine());

        int[][] width = new int[n][m + 1];
        int[][] height = new int[n + 1][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            if (y1 == y2) {// 부터 막힌거니까 최소값
                width[Math.min(x1, x2)][y1] = 1;
            } else {
                height[x1][Math.min(y1, y2)] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (width[i - 1][0] == 1) break;

            dp[i][0] = 1L;
        }


        for (int i = 1; i <= m; i++) {
            if (height[0][i - 1] == 1) break;

            dp[0][i] = 1L;
        }


        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(height[i][j]);
            }
            System.out.println();
        }*/


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

                if (width[i - 1][j] == 1) {
                    dp[i][j] -= dp[i - 1][j];
                }

                if (height[i][j - 1] == 1) {
                    dp[i][j] -= dp[i][j - 1];
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
