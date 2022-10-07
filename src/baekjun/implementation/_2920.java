package baekjun.implementation;

import java.io.*;

public class _2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        String answer="";
        for (int i=0;i<arr.length-1;i++){
            if(Integer.parseInt(arr[i])==Integer.parseInt(arr[i+1])-1){
                answer="ascending";
            }
            else if (Integer.parseInt(arr[i])==Integer.parseInt(arr[i+1])+1) {
                answer="descending";
            }
            else {
                answer="mixed";
                break;
            }
        }

        System.out.println(answer);
    }
}
