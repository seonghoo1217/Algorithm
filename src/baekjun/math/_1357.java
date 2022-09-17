package baekjun.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class _1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        char[] arr1 = st.nextToken().toCharArray();
        char[] arr2 = st.nextToken().toCharArray();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (char x:arr1){
            sb1.append(x);
        }
        for (char x:arr2){
            sb2.append(x);
        }
        sb1.reverse();
        sb2.reverse();
        StringBuilder sb3=new StringBuilder();
        int Sum = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        sb3.append(Sum);
        System.out.println(Integer.parseInt(sb3.reverse().toString()));
    }
}
