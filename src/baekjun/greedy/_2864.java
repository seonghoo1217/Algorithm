package baekjun.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        String N = st.nextToken();
        String M = st.nextToken();
        String min1="";
        String max1="";
        String min2="";
        String max2="";
        for (int i=0;i<N.length();i++){
            if(N.charAt(i)=='5'){
                max1+="6";
            }else {
                max1+=N.charAt(i);
            }
            if(N.charAt(i)=='6'){
                min1+="5";
            }else {
                min1+=N.charAt(i);
            }
        }
        for (int i=0;i<M.length();i++){
            if(M.charAt(i)=='5'){
                max2+="6";
            }else {
                max2+=M.charAt(i);
            }
            if(M.charAt(i)=='6'){
                min2+="5";
            }else {
                min2+=M.charAt(i);
            }
        }
        int max = Integer.parseInt(max1) +  Integer.parseInt(max2);
        int min = Integer.parseInt(min1) +  Integer.parseInt(min2);

        System.out.println(min + " " + max);
    }
}
