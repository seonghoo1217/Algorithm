package baekjun.math;

import java.io.*;
import java.util.StringTokenizer;

public class _1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr=new int[1002];

        int count = 1;

        for (int i=1;i<=1000;i++){
            for (int j=0;j<i;j++){
                if (count==1001) break;
                arr[count]=i;
                count++;
            }
        }
        int sum =0;
        for (int i=N;i<=M;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
