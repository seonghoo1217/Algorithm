package baekjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] split = S.split("-");
        for (int i=0;i<split.length;i++){
            System.out.print(split[i].charAt(0));
        }
    }
}
