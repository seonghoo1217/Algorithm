package baekjun.dataStructure;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,String> hashMap=new HashMap<>();
        for (int i=0;i<N;i++){
            String[] s = br.readLine().split(" ");
            hashMap.put(s[0],s[1]);
        }
        for (int i=0;i<M;i++){
            String S = br.readLine();
            System.out.println(hashMap.get(S));
        }
    }
}
