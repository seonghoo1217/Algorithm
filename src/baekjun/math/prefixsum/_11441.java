package baekjun.math.prefixsum;

import java.io.*;
import java.util.StringTokenizer;

public class _11441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        for (int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken())-1;
            int num2 = Integer.parseInt(st.nextToken());
            int answer=0;
            for (int k=num1;k<num2;k++){
                answer+=arr[k];
            }
            bw.write(String.valueOf(answer)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
