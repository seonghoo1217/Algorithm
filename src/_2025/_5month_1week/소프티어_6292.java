package _2025._5month_1week;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소프티어_6292 {
    static final long MOD = 1_000_000_007L;

    static long modPow(long a, long e) {
        long result = 1;
        a %= MOD;

        while (e > 0) {
            if ((e & 1) == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            e >>= 1;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long K = Long.parseLong(st.nextToken());
        long P = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        long exponent = N * 10;

        long answer = (K % MOD) * modPow(P, exponent) % MOD;
        System.out.println(answer);
    }
}
