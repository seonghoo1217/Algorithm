package baekjun.string;

import java.io.*;

public class _4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String S1 = br.readLine();
        String S2 = br.readLine();
        if (S1.length()>=S2.length()) System.out.println("go");
        else System.out.println("no");
    }
}
