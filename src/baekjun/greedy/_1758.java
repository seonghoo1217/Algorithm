package baekjun.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class _1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer [] arr=new Integer[N];
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        long answer = getTip(arr);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }


    public static long getTip(Integer[] arr){
        long tip=0;

        for (int i=0;i<arr.length;i++){
            long x = arr[i] - (i + 1 - 1);
            tip += Math.max(x, 0);
        }

        return tip;
    }
}
