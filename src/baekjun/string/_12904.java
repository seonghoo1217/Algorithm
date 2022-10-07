package baekjun.string;

import java.io.*;

public class _12904 {
    static String S1,S2;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        S1 = br.readLine();
        S2 = br.readLine();

        dfs(S1);
        System.out.println(0);
    }
    static void dfs (String s1){
        if (s1.length()==S2.length()){
            if (s1.equals(S2)){
                System.out.println(1);
                System.exit(0);
            }
            return;
        }
        dfs(s1+"A");
        dfs(reverse(s1)+"B");
    }

    static String reverse(String s1){
        return new StringBuilder(s1).reverse().toString();
    }
}
