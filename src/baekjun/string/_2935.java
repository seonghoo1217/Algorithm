package baekjun.string;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class _2935 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        BigInteger N = scanner.nextBigInteger();
        char C = scanner.next().charAt(0);
        BigInteger M = scanner.nextBigInteger();

        if (C=='+'){
            System.out.println(N.add(M));
        }else {
            System.out.println(N.multiply(M));
        }
    }
}
