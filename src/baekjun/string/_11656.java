package baekjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class _11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String[] arr=new String[S.length()];

        for (int i=0;i<S.length();i++){
            arr[i]=S.substring(i,S.length());
        }

        Arrays.sort(arr);

        for (String x:arr){
            System.out.println(x);
        }
    }
}
