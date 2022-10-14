package baekjun.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt=2;
        int res=0;
        int N = Integer.parseInt(br.readLine());
        Integer arr[]=new Integer[N];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0;i<N;i++){
            res=Math.max(res,cnt+arr[i]);
            cnt++;
        }
        System.out.println(res);
    }
}
