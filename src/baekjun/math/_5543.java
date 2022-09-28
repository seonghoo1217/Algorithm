package baekjun.math;

import java.io.*;
import java.util.Arrays;

public class _5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr1=new int[3];
        int [] arr2=new int [2];
        for (int i=0;i<3;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0;i<2;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int result = arr1[0] + arr2[0] - 50;
        System.out.println(result);
    }
}
