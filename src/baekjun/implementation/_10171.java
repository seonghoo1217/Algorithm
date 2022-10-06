package baekjun.implementation;

import java.io.*;

public class _10171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        sb.append("\\    /\\ \n");
        sb.append(" )  ( ') \n");
        sb.append("(  /  ) \n");
        sb.append(" \\(__)|");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
