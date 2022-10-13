package baekjun.hashmapandset;

import java.io.*;
import java.util.HashSet;

public class _11478 {
    static HashSet<String> hashSet=new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        String temp="";

        for (int i=0;i<S.length();i++){
            temp="";
            for (int j=i;j<S.length();j++){
                temp+=S.substring(j,j+1);
                hashSet.add(temp);
            }
        }
        System.out.println(hashSet.size());
    }
}
