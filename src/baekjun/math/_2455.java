package baekjun.math;

import java.io.*;
import java.util.StringTokenizer;

public class _2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int max=0;
        int now=0;
        StringTokenizer st;
        for (int i=0;i<4;i++){
            st=new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            now=now-out+in;
            max=Math.max(max,now);
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
