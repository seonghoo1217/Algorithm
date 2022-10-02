package baekjun.dataStructure;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class _11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pr=new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());

            if (num==0){
                if (pr.isEmpty()){
                    sb.append("0").append("\n");
                }else {
                    sb.append(pr.poll()).append("\n");
                }
            }else {
                pr.offer(num);
            }
        }
        System.out.println(sb);
    }
}
