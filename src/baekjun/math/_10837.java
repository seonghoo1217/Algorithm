package baekjun.math;

import java.io.*;
import java.util.Scanner;

public class _10837 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		while (c-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int gap = Math.abs(a - b);
			int remain = n - Math.max(a, b);

			if (a == b) {
				sb.append("1\n");
			} else if (a < b) {
				if (gap - remain <= 1) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else {
				if (gap - remain <= 2) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
