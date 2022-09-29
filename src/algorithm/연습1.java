package algorithm;

import java.io.*;

public class 연습1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int a=0,b=0,c=0;
        for (int i=0;i<N;i++){
            if(String.valueOf(arr[i]).matches("[0-9]")) c++;
            if (String.valueOf(arr[i]).matches("[a-z]")) b++;
            if (String.valueOf(arr[i]).matches("[A-Z]")) a++;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
