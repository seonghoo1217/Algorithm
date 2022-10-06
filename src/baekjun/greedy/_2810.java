package baekjun.greedy;

import java.io.*;
import java.util.Stack;

public class _2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int count=1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]=='S') count++;
            else if (arr[i]=='L'){
                i++;
                count++;
            }
        }
        if (count>N) System.out.println(N);
        else System.out.println(count);
    }
}
