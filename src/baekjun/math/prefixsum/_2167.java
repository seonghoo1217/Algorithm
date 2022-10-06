package baekjun.math.prefixsum;

import java.io.*;
import java.util.StringTokenizer;

public class _2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String S="";
        StringTokenizer st;
        while ((S=br.readLine())!=null){
            st=new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int [][] arr=new int[N][M];
            for (int i=0;i<N;i++){
                st=new StringTokenizer(br.readLine());
                for (int j=0;j<M;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }
        }
    }
}
