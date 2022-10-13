package baekjun.hashmapandset;

import java.io.*;
import java.util.*;

public class _2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        HashSet<Integer> hashset=new HashSet<>();
        StringTokenizer st;
        for (int i=0;i<T;i++){
            hashset.clear();
            int N = Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++){
                int num = Integer.parseInt(st.nextToken());
                hashset.add(num);
            }

            int M = Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            StringBuilder sb=new StringBuilder();
            for (int k=0;k<M;k++){
                int num = Integer.parseInt(st.nextToken());
                if (hashset.contains(num)){
                    sb.append(1).append('\n');
                }else {
                    sb.append(0).append('\n');
                }
            }
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }

}
