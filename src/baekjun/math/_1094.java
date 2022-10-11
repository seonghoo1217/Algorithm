package baekjun.math;

import java.io.*;

public class _1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int cnt=0;
        int line=64;
        while (N>0){
            if (line>N) line /=2;
            else {
                cnt++;
                N-=line;
            }
        }
        System.out.println(cnt);
    }
}
