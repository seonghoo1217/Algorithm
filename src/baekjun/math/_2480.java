package baekjun.math;

import java.util.Scanner;

public class _2480 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a != b && a != c &&b!=c) {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        } else if (a == b && a == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else {
            System.out.println(1000 + b * 100);
        }


    }
}

