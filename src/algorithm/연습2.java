package algorithm;

import java.io.*;
import java.util.Locale;

public class 연습2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<N;i++){
            String S = br.readLine();
            sb.append(String.valueOf(S.charAt(0)).toUpperCase());
            sb.append(S.substring(1,S.length()).toLowerCase()+"\n");
        }
        System.out.println(sb.toString());
    }
}
