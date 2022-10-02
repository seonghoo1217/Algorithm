package baekjun.greedy;

import java.io.*;

public class _2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            int q=0,d=0,n=0,p=0;
            int M = Integer.parseInt(br.readLine());

            q=M/25;
            M=M-(q*25);
            d=M/10;
            M=M-(d*10);
            n = M / 5;
            M=M-(n*5);
            p=M/1;
            M=M-(p*1);
            System.out.println(q+" "+d+" "+n+" "+p);
        }

    }
}
