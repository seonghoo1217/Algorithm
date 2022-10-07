package baekjun.string;

import java.io.*;
import java.util.StringTokenizer;

public class _5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int cnt1=0,cnt2=0;
        for (int i=0;i<S.length()-2;i++){
            if (S.charAt(i)=='J'){
                if (S.charAt(i+1)=='O'&&S.charAt(i+2)=='I'){
                    cnt1++;
                }
            }else if(S.charAt(i)=='I'){
                if (S.charAt(i+1)=='O'&&S.charAt(i+2)=='I'){
                    cnt2++;
                }
            }
        }
        System.out.println(cnt1);
        System.out.println(cnt2);

    }
}
