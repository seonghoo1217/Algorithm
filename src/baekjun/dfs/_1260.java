package baekjun.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int node = Integer.parseInt(st.nextToken());

        Stack<Integer> stack=new Stack<>();

        boolean[] visited =new boolean[N+1];
        int [][] arr=new int[N+1][N+1];

        for (int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            arr[v1][v2]=1;
            arr[v2][v1]=1;
        }

        dfs(node,N,stack,arr,visited);
    }

    public static void dfs(int node,int end,Stack<Integer> stack,int[][] arr,boolean[] visited){
        visited[node]=true;

        stack.push(node);
        if (node==end){
            for (int i=0;i<stack.size();i++){
                System.out.print(stack.elementAt(i)+" ");
            }
            System.out.print(node);
        }

        for (int i=1;i<=arr.length-1;i++){
            if (arr[node][i]==1&&!visited[i]){
                dfs(i,end,stack,arr,visited);
            }
        }
        stack.pop();
    }

}
