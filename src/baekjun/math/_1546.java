package baekjun.math;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        double answer=0;
        double [] arr=new double[n];
        for (int i=0;i<n;i++) {
            arr[i]= scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(arr);
        double max = arr[arr.length - 1];
        for (int i=0;i<arr.length;i++){
            arr[i]=((arr[i]/max)*100);
            answer+=arr[i];
        }
        System.out.print(answer/arr.length);
    }
}
