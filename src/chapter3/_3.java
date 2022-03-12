package chapter3;

import java.util.Scanner;

public class _3 {

    public void solution(int n1,int n2,int[] arr){
        int answer,sum=0;
        for (int i=0;i<n2;i++)sum+=arr[i];
        answer=sum;
        for (int i=n2;i<n1;i++){
            sum+=(arr[i]-arr[i-n2]);
            answer=Math.max(answer,sum);
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        _3 N=new _3();
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int[] arr=new int[n1];
        for (int i=0;i<n1;i++){
            arr[i] = kb.nextInt();
        }

        N.solution(n1,n2,arr);
    }
}
