package baekjun.math;

import java.io.*;
import java.util.StringTokenizer;

public class _2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());

        for (int i=0;i<5;i++){
            int num = Integer.parseInt(st.nextToken());
            System.out.print(num-(N*M)+" ");
        }
    }
}
