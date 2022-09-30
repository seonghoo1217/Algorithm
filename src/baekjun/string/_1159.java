package baekjun.string;

import java.io.*;
import java.util.HashMap;

public class _1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Integer> hashMap=new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            char c = br.readLine().charAt(0);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for (char x: hashMap.keySet()){
            if (hashMap.get(x)>=5){
                sb.append(x);
            }
        }

        if (sb.toString().length()>0){
            System.out.println(sb.toString());
        }else {
            System.out.println("PREDAJA");
        }
    }
}
