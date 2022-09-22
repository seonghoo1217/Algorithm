package baekjun.dataStructure;

import java.io.*;
import java.util.Stack;

public class _10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<N;i++){
            String S = br.readLine();
            String[] arr = S.split(" ");

            System.out.println("S="+S);
            System.out.println(stack);
            if (arr[0].equals("push")){
                System.out.println("arr[0]="+arr[0]);
                System.out.println("arr[1]="+arr[1]);
                stack.push(Integer.parseInt(arr[1]));
            }

            if (S.equals("top")&&!stack.isEmpty()) System.out.println(stack.peek());
            else System.out.println(-1);

            if (S.equals("size")) System.out.println(stack.size());

            if (S.equals("pop")&&!stack.isEmpty()) System.out.println(stack.pop());
            else System.out.println(-1);

            if (S.equals("empty")&&stack.isEmpty()) System.out.println(1);
            else System.out.println(0);

        }
    }
}
