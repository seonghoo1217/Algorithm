package baekjun.string;

import java.io.*;

public class _11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if (s.equals("END")) break;
            else {
                StringBuilder sb=new StringBuilder();
                StringBuilder reverse = sb.append(s).reverse();
                System.out.println(reverse);
            }
        }
    }
}
