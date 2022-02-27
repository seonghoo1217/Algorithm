package chapter2;

import java.util.Scanner;

public class _9 {

    public int solution(int i,int [][] arr){
        int answer=Integer.MIN_VALUE;
        int sum1,sum2;
        for (int k=0;k<i;k++){
            sum1=sum2=0;
            for (int n=0;n<i;n++){
                sum1+=arr[k][n];
                sum2+=arr[n][k];
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
        }
        sum1=sum2=0;
        for (int k=0;k<i;k++){
            sum1+=arr[k][k];
            sum2+=arr[k][i-k-1];
        }
        answer=Math.max(answer,sum1);
        answer=Math.max(answer,sum2);

        return answer;
    }


    public static void main(String[] args) {
        _9 N=new _9();
        Scanner kb=new Scanner(System.in);
        int i = kb.nextInt();
        int [][] arr=new int[i][i];
        for (int k=0; k<i;k++){
            for (int n=0;n<i;n++){
                arr[k][n]=kb.nextInt();
            }
        }
        System.out.print(N.solution(i,arr));
    }
}
