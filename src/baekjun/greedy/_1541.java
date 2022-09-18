package baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1541 {
    public static void main(String[] args) throws IOException {
        //55-50+40
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        StringTokenizer subs=new StringTokenizer(br.readLine(),"-");
        while (subs.hasMoreTokens()){
            int temp=0;
            StringTokenizer st = new StringTokenizer(subs.nextToken(), "+");

            while (st.hasMoreTokens()){
                temp += Integer.parseInt(st.nextToken());
            }
            if (sum==Integer.MAX_VALUE){
                sum=temp;
            }else {
                sum-=temp;
            }
        }
        System.out.println(sum);
    }
}
