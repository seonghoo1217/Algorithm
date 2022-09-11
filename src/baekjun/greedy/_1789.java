package baekjun.greedy;

import java.util.Scanner;

public class _1789 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long N = scanner.nextLong();
        long answer=0;
        int count =0;
        for (int i=1; ;i++){
            if (answer>N) break;
            answer+=i;
            count++;
        }
        System.out.println(count-1);
    }
}
