package baekjun.greedy;

import java.io.*;

public class _2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        if (N==1) System.out.println(0);
        else {
            int cnt=0;

            for (int i=N-2;i>=0;i--){
                int high = arr[i + 1];
                int low = arr[i];

                if (low>=high){
                    cnt+=low-(high-1);
                    arr[i]=high-1;
                }
            }
            System.out.println(cnt);
        }
    }

}
