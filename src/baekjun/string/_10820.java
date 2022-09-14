package baekjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S="";
        while ((S=br.readLine())!=null){
            int small=0,big=0,integer=0,split=0;
            char[] arr = S.toCharArray();
            for (int i=0;i<arr.length;i++){
                if (arr[i]>='a'&&arr[i]<='z') small++;
                if(arr[i]>='A'&&arr[i]<='Z') big++;
                if (arr[i]>='0'&&arr[i]<='9')integer++;
                if(arr[i]==' ') split++;
            }
            System.out.println(small+" "+big+" "+integer+" "+split);
        }
    }
}
