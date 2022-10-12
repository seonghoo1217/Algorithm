package baekjun.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();

        String result="";

        String A="AAAA",B="BB";
        S=S.replaceAll("XXXX",A);
        result = S.replaceAll("XX", B);

        if (result.contains("X")) System.out.println(-1);
        else {
            System.out.println(result);
        }
    }
}
