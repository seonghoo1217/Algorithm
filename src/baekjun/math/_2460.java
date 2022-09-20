package baekjun.math;

import java.io.*;
import java.util.StringTokenizer;

public class _2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int max=0;
        int human=0;
        //0 32=32
        //3 13=29+13=42
        //28 25 = -3
        //17 5= -12
        //21 20=-1
        //11 0=-11
        //12 12=0
        //4 2=-2
        //0 8=8
        //21 0 =-21
        for (int i=0;i<10;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            human-=out;
            human+=in;
            if(human>max) max=human;
        }
        bw.write(max);
    }
}
