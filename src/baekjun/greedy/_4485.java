package baekjun.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class _4485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int N = Integer.parseInt(br.readLine());

            if (N==0){
                break;
            }

            int problem_count=1;

            int [][] arr=new int[N][N];

            for (int i=0;i<N;i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                for (int k=0;k<N;k++){
                    arr[i][k]=Integer.parseInt(st.nextToken());
                }
            }


        }
    }
}
