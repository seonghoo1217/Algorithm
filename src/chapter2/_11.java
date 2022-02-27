package chapter2;

import java.util.Scanner;

public class _11 {

    public int solution(int i,int[][] arr){
        int answer=0;

        int min=Integer.MIN_VALUE;
        for (int k=1;k<=i;k++){
            int count =0;
            for (int n=1;n<=i;n++){
                for (int x=1;x<=5;x++){
                    if(arr[k][x]==arr[n][x]){
                        count++;
                        break;
                    }
                }
            }
            if(count>min){
                min=count;
                answer=k;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        _11 N=new _11();
        int i = kb.nextInt();
        int[][] arr = new int[i+1][6];
        for (int k=1; k<=i;k++){
            for (int n=1;n<=5;n++){
                arr[k][n] = kb.nextInt();
            }
        }
        System.out.println(N.solution(i,arr));
    }
}
