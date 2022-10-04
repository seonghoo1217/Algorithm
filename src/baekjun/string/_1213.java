package baekjun.string;

import java.io.*;

public class _1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int a[]=new int[26];

        for (int i=0;i<S.length();i++){
            int index = S.charAt(i) - 'A';
            a[index]++;
        }
        int check=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0) check++;
        }

        String answer="";
        StringBuilder sb=new StringBuilder();
        if (check>1) answer+="I'm Sorry Hansoo";
        else {
            for (int i=0;i<a.length;i++){
                for (int j=0;j<a[i]/2;j++){
                    sb.append((char) (i+65));
                }
            }
            answer+=sb.toString();
            String end = sb.reverse().toString();

            sb=new StringBuilder();

            for (int i=0;i<a.length;i++){
                if (a[i]%2==1){
                    sb.append((char) (i+65));
                }
            }
            answer +=sb.toString()+end;
        }
        System.out.println(answer);
    }
}
