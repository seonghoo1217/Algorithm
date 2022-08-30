package baekjun.conditional;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        if (m-45<0){
            m=60+m-45;
            h=h-1;
            if (h<0){
                h=23;
            }
        }else {
            m-=45;
        }

        System.out.print(h+" "+m);
    }
}
