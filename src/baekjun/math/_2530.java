package baekjun.math;

import java.io.*;
import java.util.StringTokenizer;

public class _2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(br.readLine());

        M+=x/60;
        S+=x%60;

        M+=S/60;
        S=S%60;

        H+=M/60;
        M=M%60;

        H=H%24;

        System.out.println(H + " " + M +" "+ S);
    }
}
