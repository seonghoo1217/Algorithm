package baekjun.dataStructure;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class _11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue pq=new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1)>Math.abs(o2)){
                    return Math.abs(o1)-Math.abs(o2);
                }else if (Math.abs(o1)==Math.abs(o2)){
                    return o1-o2;
                }else {
                    return -1;
                }
            }
        });
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if (num==0){
                if(pq.isEmpty()){
                    sb.append("0").append("\n");
                }else {
                    sb.append(pq.poll()).append("\n");
                }
            }else {
                pq.offer(num);
            }
        }
        System.out.println(sb);
    }
}
