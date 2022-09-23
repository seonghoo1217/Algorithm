package programers.monthCodeChallenge;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class 연습 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hashMap=new LinkedHashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            int x = Integer.parseInt(st.nextToken());
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }
        int M = Integer.parseInt(br.readLine());

        System.out.println(hashMap.get(M));
    }
}
