package baekjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] check=new int[26];
        for (int i=0;i<check.length;i++){
            check[i]=-1;
        }
        for (int i=0;i<S.length();i++){
            if (check[S.charAt(i)-'a']==-1){
                check[S.charAt(i)-'a']=i;;
            }
        }

        for (int i=0;i<check.length;i++){
            System.out.print(check[i]+" ");
        }
    }
}
