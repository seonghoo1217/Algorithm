package baekjun.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int D=gcd(N,M);

        System.out.println(D);
        System.out.println(N*M/D);
    }

    private static int gcd(int n, int m) {
        if(m==0) return n;

        return gcd(m,n%m);
    }
}
