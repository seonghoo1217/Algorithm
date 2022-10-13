package baekjun.math.prefixsum;

import java.io.*;
import java.util.StringTokenizer;

public class _2435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int cd = Integer.parseInt(st.nextToken());
        int[] arr=new int[day];
        st=new StringTokenizer(br.readLine());
        for (int i=0;i<day;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<=day-cd;i++){
            int answer=0;
            for (int j=0;j<cd;j++){
                answer+=arr[i+j];
            }
            if (answer>max){
                max=answer;
            }
        }
        System.out.println(max);
    }
}
