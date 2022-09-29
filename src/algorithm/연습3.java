package algorithm;

import java.io.*;

public class 연습3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        String S2 = br.readLine();
        if(S2.contains(S)) bw.write(String.valueOf(1));
        else bw.write(String.valueOf(0));
        bw.flush();
        bw.close();
    }
}
