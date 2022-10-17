package baekjun.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class _11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr=new Integer[N];

        for (int i=0;i<N;i++) arr[i]=Integer.parseInt(br.readLine());
        Arrays.sort(arr, Collections.reverseOrder());

        int sum=0;
        for (int i=0;i<N;i++){
            if (i%3==2) continue;
            sum+=arr[i];
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
