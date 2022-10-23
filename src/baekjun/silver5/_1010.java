package baekjun.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class _1010 {

    static int [][] dp=new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        //3
        //2 2
        //1 5
        //13 29
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            sb.append(combi(x1,x2)).append('\n');
        }
        System.out.println(sb);
    }
    static int combi(int n,int r){
        if (dp[n][r]>0){
            return dp[n][r];
        }

        if (n==r||r==0){
            return dp[n][r]=1;
        }

        return dp[n][r]=combi(n-1,r-1)+combi(n-1,r);
    }
}
