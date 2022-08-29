package baekjun.math;

import java.math.BigInteger;
import java.util.Scanner;

public class _1271 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger money = scanner.nextBigInteger();
        BigInteger count = scanner.nextBigInteger();
        scanner.close();

        System.out.println(money.divide(count));
        System.out.println(money.remainder(count));
    }
}
