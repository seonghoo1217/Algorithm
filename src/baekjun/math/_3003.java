package baekjun.math;

import java.util.Scanner;

public class _3003 {
    public class Main{

    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,8};
        int[] count=new int[6];
        Scanner kb=new Scanner(System.in);
        for (int i=0;i<6;i++){
            count[i] = kb.nextInt();
        }

        for (int i=0;i<count.length;i++){
            count[i]=arr[i]-count[i];
            System.out.println(count[i]);
        }
    }
}
