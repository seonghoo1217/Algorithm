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

            if (arr[0].equals("push")) stack.push(Integer.parseInt(arr[1]));
            else if (S.equals("top")&&!stack.isEmpty()) System.out.println(stack.peek());
            else if (S.equals("top"))System.out.println(-1);
            else if (S.equals("size")) System.out.println(stack.size());
            else if (S.equals("pop")&&!stack.isEmpty()) System.out.println(stack.pop());
            else if (S.equals("pop"))System.out.println(-1);
            else if (S.equals("empty")&&stack.isEmpty()) System.out.println(1);
            else if (S.equals("empty"))System.out.println(0);

        }
    }
}
