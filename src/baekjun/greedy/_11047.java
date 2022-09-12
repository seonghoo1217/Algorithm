package baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr =new int[N];
        int count=0;
        int money = Integer.parseInt(st.nextToken());
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for (int i=N-1;i>=0;i--){
            if (arr[i]<=money){
                count+=money/arr[i];
                money=money%arr[i];
            }
        }
        System.out.print(count);
    }
}
