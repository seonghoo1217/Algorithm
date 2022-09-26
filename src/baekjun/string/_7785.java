package baekjun.string;

import java.io.*;
import java.util.*;

public class _7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> hashMap=new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            hashMap.put(st.nextToken(),st.nextToken());
        }
        TreeMap<String, String> reverse = new TreeMap<>(Collections.reverseOrder());
        reverse.putAll(hashMap);
        for (String s:reverse.keySet()){
            if (hashMap.get(s).equals("enter")) System.out.println(s);
        }
    }
}
