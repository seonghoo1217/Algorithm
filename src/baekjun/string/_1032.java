package baekjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str=new String[N];
        for (int i=0;i<N;i++){
            str[i]=br.readLine();
        }

        StringBuilder sb=new StringBuilder();
        boolean check=true;
        for (int i=0;i<str[0].length();i++){
            char c = str[0].charAt(i);

            check=true;
            for (int j=0;j<N;j++){
                if (c!=str[j].charAt(i)){
                    check=false;
                    break;
                }
            }

            if (check){
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb.toString());
    }
}
