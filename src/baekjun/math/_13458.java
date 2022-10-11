package baekjun.math;

import java.io.*;
import java.util.StringTokenizer;

public class _13458 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count=0;

        String[] chars = br.readLine().split(" ");
        String[] chars2 = br.readLine().split(" ");

        double main = Integer.parseInt(chars2[0]);
        double sub = Integer.parseInt(chars2[1]);

        for (int i=0;i<chars.length;i++){
            double X = Integer.parseInt(chars[i]);
            if(X-main>=0){
                X-=main;
                count++;
            }
            if (X>0){
                count+=Math.max(1,Math.ceil(X/sub));
            }
        }
        System.out.println(count);
    }*/

    static int n,B,C;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken()); // 총 감독관 관리가능 수(한 명)
        C = Integer.parseInt(st.nextToken()); // 부 감독관 관리가능 수(여러 명)
        System.out.println(solve());
    }

    private static long solve() {
        long result = 0;
        for(int i=0;i<n;i++) {
            // 총 시험 감독관 집어 넣기.
            int t = arr[i]-B;
            result++;
            if(t<=0) continue;
            // 부 감독관 넣기.
            // 1. 부 감독관이 딱 맞출 수 있냐, 2. 남을 경우 1명더 넣자.
            if(t%C==0) {
                result += t/C;
            }else {
                result += t/C;
                result++;
            }
        }
        return result;
    }
}
