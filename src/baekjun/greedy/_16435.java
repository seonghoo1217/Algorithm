package baekjun.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int [] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i=0;i<N;i++){
            if (arr[i]<=line) line++;
        }
        System.out.println(line);
    }
}
