package algorithm;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 연습4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap=new HashMap<>();
        String[] split = br.readLine().split("");
        for (int i=0;i<N;i++){
            String key = split[i];
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
        }
        int max=0;
        String answer="";
        for (String x: hashMap.keySet()){
            if(hashMap.get(x)>max){
                max=hashMap.get(x);
                answer=x;
            }
        }
        System.out.println(answer);
    }
}
