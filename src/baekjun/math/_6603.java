package baekjun.math;

import java.io.*;

public class _6603 {
    static int N;
    static int [] intarr;
    static boolean [] chk;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String S = br.readLine();

            if (S.equals("0")) break;
            String[] arr = S.split(" ");
            N = Integer.parseInt(arr[0]);
            intarr=new int[N];
            chk=new boolean[N];

            for (int i=0;i<N;i++){
                intarr[i]=Integer.parseInt(arr[i+1]);
            }

            dfs(0,0);
            System.out.println();
        }
    }

    private static void dfs(int depth, int start) {
        if (depth==6){
            for (int i=0;i<N;i++){
                if (chk[i]){
                    System.out.print(intarr[i]+" ");
                }
            }
            System.out.println();
        }
        for (int i=start;i<N;i++){
            chk[i]=true;
            dfs(depth+1,i+1);
            chk[i]=false;
        }
    }
}
