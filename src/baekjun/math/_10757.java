package baekjun.math;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class _10757 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        BigInteger b1 = BigInteger.valueOf(Long.parseLong(st.nextToken()));
        BigInteger b2 = BigInteger.valueOf(Long.parseLong(st.nextToken()));
        BigInteger result = b1.add(b2);
        System.out.println(result);*/
        Scanner scanner=new Scanner(System.in);
        BigInteger b1 = scanner.nextBigInteger();
        BigInteger b2 = scanner.nextBigInteger();
        BigInteger result = b1.add(b2);
        System.out.println(result);
    }
}
