package baekjun.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class _1931 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][2];

        for (int i=0;i<n;i++){
            arr[i][0]= scanner.nextInt();
            arr[i][1]= scanner.nextInt();
        }
        Arrays.sort(arr,(a,b)->{
            if (a[1]==b[1])return a[0]-b[0];
            return a[1]-b[1];
        });

        /*for (int i=0;i<n;i++){
            System.out.println("arr[i][0] = " + arr[i][0]);
            System.out.println("arr[i][1] = " + arr[i][1]);
        }*/

        int answer=0;
        int time=0;

        for (int i=0;i<n;i++){
            if (arr[i][0]>=time){
                time=arr[i][1];
                answer++;
            }
        }
        System.out.print(answer);
    }
}
