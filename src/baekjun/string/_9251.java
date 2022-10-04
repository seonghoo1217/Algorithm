package baekjun.string;

import java.io.*;

public class _9251 {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(LCS(str1, str2));int count=0;
    }
    static int LCS(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        dp = new int[n1+1][n2+1];
        for(int i=1; i<n1+1; i++) {
            for(int j=1; j<n2+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
}
