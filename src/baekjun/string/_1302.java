package baekjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (int i=0;i<N;i++){
            String key = br.readLine();
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
        }
        int max=0;
        for (String key:hashMap.keySet()){
            max = Math.max(hashMap.get(key), max);
        }
        ArrayList<String> arrayList=new ArrayList<>(hashMap.keySet());
        Collections.sort(arrayList);

        for (String x:arrayList){
            if (hashMap.get(x)==max){
                System.out.println(x);
                break;
            }
        }
    }
}
