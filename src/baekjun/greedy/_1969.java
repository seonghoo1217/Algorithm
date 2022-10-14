package baekjun.greedy;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] [] alpha=new int[M][26];
        StringBuilder sb=new StringBuilder();
        int hd=0;
        String[] dnas =new String[N];

        for (int i=0;i<N;i++){
            dnas[i]=br.readLine();
            for (int k=0;k<M;k++){
                alpha[k][dnas[i].charAt(k)-'A']+=1;
            }
        }

        for (int i=0;i<M;i++){
            int max=alpha[i][0];
            char target='A';

            for (int k=0;k<26;k++){
                if (alpha[i][k]>max){
                    max=alpha[i][k];
                    target=(char)(k+'A');
                }
            }
            sb.append(target);
        }

        for (int i=0;i<N;i++){
            for (int k=0;k<M;k++){
                if (dnas[i].charAt(k)!=sb.charAt(k)) hd++;
            }
        }

        System.out.println(sb.toString());
        System.out.println(hd);
    }
}
