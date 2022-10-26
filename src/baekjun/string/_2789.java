package baekjun.string;

import java.io.*;

public class _2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='C') continue;
            else if (chars[i]=='A') continue;
            else if (chars[i]=='M') continue;
            else if (chars[i]=='B')continue;
            else if (chars[i]=='R') continue;
            else if (chars[i]=='I') continue;
            else if (chars[i]=='D') continue;
            else if (chars[i]=='G') continue;
            else if (chars[i]=='E') continue;
            else sb.append(chars[i]);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
