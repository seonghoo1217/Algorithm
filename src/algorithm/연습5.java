package algorithm;

import java.io.*;
import java.util.Arrays;

public class 연습5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String answer="YES";
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                answer="NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
