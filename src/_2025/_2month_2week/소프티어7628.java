package _2025._2month_2week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소프티어7628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] dp = new int[101];
        for (int i = 2; i <= 100; i++) {
            for (int j = 0; j < N; j++) {
                int house = Integer.parseInt(s[j]);
                if (house % i == 0) {
                    dp[i]++;
                }
            }
        }


        int max = Integer.MIN_VALUE;

        for (int i = 2; i <= 100; i++) {
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
