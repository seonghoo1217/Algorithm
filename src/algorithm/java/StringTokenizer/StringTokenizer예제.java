package algorithm.java.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizer예제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringTokenizer st=new StringTokenizer(S,"0");
        System.out.println(st.nextToken());
    }
}
