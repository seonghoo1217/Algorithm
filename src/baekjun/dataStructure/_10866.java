package baekjun.dataStructure;

import java.io.*;
import java.util.ArrayDeque;

public class _10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<N;i++){
            String[] S = br.readLine().split(" ");

            switch (S[0]){
                case "push_front":{
                    deque.addFirst(Integer.parseInt(S[1]));
                    break;
                }
                case "push_back":{
                    deque.addLast(Integer.parseInt(S[1]));
                    break;
                }
                case "pop_front":{
                    if (deque.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.pollFirst()).append('\n');
                    }
                    break;
                }

                case "pop_back":{
                    if (deque.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                    break;
                }
                case "size":{
                    sb.append(deque.size()).append('\n');
                    break;
                }

                case "empty":{
                    if (deque.isEmpty()){
                        sb.append(1).append('\n');
                    }else {
                        sb.append(0).append('\n');
                    }
                    break;
                }

                case "front":{
                    if (deque.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.peekFirst()).append('\n');
                    }
                    break;
                }

                case "back":{
                    if (deque.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(deque.peekLast()).append('\n');
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
