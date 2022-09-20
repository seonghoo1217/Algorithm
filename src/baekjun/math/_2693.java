package baekjun.math;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2693 {
    public static void main(String[] args) throws IOException {
//        4
//        1 2 3 4 5 6 7 8 9 1000
//        338 304 619 95 343 496 489 116 98 127
//        931 240 986 894 826 640 965 833 136 138
//        940 955 364 188 133 254 501 122 768 408
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            int[] arr=new int[10];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for (int j=0;j<10;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }
}
