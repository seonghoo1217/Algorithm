package baekjun.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count=0;
        int next=0;
        int [] a=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for (int i=0;i<N;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }

        for (int i=0;i<a.length;i++){
            if (a[i]==next&&next==0){
                count++;
                next=1;
                continue;
            }
            if (a[i]==next&&next==1){
                count++;
                next=2;
                continue;
            }if (a[i]==next&&next==2){
                count++;
                next=0;
            }
        }
        System.out.println(count);
    }
}
